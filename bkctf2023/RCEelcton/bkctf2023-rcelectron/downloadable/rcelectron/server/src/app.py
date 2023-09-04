from utils import *
from flask import Flask, render_template, request, session, redirect, url_for
import requests
from flask_sqlalchemy import SQLAlchemy
import uuid
import os
import logging


app = Flask(__name__)
app.config["LOG_TYPE"] = os.environ.get("LOG_TYPE", "stream")
app.config["LOG_LEVEL"] = os.environ.get("LOG_LEVEL", "INFO")

app.secret_key = os.environ.get('SECRET_KEY', os.urandom(32))

app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///tickets.db'
admin_password = os.environ.get('PASSWD', uuid.uuid4().hex)

captcha_secret_key = os.environ.get('RECAPTCHA_SECRET_KEY', "")
site_key = os.environ.get('SITE_KEY', "")


db = SQLAlchemy(app)
ADMIN_COOKIE = ""


class User(db.Model):
    username = db.Column(db.String(50), primary_key=True)
    password = db.Column(db.String(50))

# Define the Ticket model


class Ticket(db.Model):
    id = db.Column(db.String(36), primary_key=True, unique=True)
    title = db.Column(db.String(100))
    content = db.Column(db.Text)
    username = db.Column(db.String(50))
    timestamp = db.Column(db.DateTime, default=db.func.current_timestamp())


def is_valid_ticket(id, username):
    # mess = ""
    if not is_valid_uuid(id):
        return "Invalid ticket id"

    ticket = db.session.get(Ticket, id)
    if not ticket or (ticket.username != username and username != "admin"):
        return "No ticket found"

    return "OK"


@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        data = request.form
        username = data.get('username')
        password = data.get('password')

        if username and password:
            # user = User.query.filter_by(username=username).first()
            user = User.query.filter_by(username=username).first()
            if user and password == user.password:
                session['username'] = username
                # Redirect to the home page or perform other actions upon successful login
                return redirect(url_for('home'))
        return render_template('login.html', error_message='Invalid username or password.')
    else:
        return render_template('login.html')


@app.route('/signup', methods=['GET', 'POST'])
def signup():
    if request.method == 'POST':
        data = request.form
        username = data.get('username')
        password = data.get('password')
        if username and password:
            if User.query.filter_by(username=username).first():
                error_message = 'Username already exists. Please choose a different username.'
            else:
                user = User(username=username, password=password)
                db.session.add(user)
                db.session.commit()
                return redirect(url_for('login'))
        else:
            error_message = 'Invalid username or password.'
        return render_template('signup.html', error_message=error_message)
    else:
        return render_template('signup.html')


@app.route('/ticket', methods=['POST'])
def post_ticket():
    data = request.form
    username = session.get('username')
    if not username:
        res = "No user found"
        return render_template("home.html", error_message=res)
    title = data.get('title')
    content = data.get('content')

    if not data['content'] or not data['title']:
        res = "Content and Title is empty"
        return render_template("home.html", error_message=res)

    ticket = Ticket(id=str(uuid.uuid4()), title=title,
                    content=content, username=username)
    db.session.add(ticket)
    db.session.commit()

    return redirect(url_for(f'get_ticket', id=ticket.id))


@app.route('/ticket/<id>')
def get_ticket(id):
    username = session.get('username')
    if not username:
        res = "No user found"
        return render_template("ticket.html", error_message=res)

    if not is_valid_uuid(id):
        res = "Invalid ticket id"
        return render_template("ticket.html", error_message=res)

    ticket = db.session.get(Ticket, id)
    if not ticket or (ticket.username != username and username != "admin"):
        res = "No ticket found"
        return render_template("ticket.html", error_message=res)
    else:
        return render_template("ticket.html", ticket=ticket, sitekey=site_key)


def save_admin_cookie():
    global ADMIN_COOKIE
    r = requests.post("http://localhost:5000/login",
                      data={"username": "admin", "password": admin_password}, allow_redirects=False)

    cookie = r.cookies.get_dict().get("session", "")
    if cookie:
        app.logger.info("Got cookie", cookie)
        ADMIN_COOKIE = cookie
    else:
        app.logger.info("Error when login admin", r.status_code)


@app.route('/report', methods=['POST', 'GET'])
def report():
    global ADMIN_COOKIE
    if request.method == "POST":
        username = session.get('username')
        data = request.form
        if not username:
            res = "No user found"
            return render_template("ticket.html", error_message=res)

        id = data.get("id")
        captcha = data.get("g-recaptcha-response")  # not used yet
        print(captcha)
        if not is_valid_captcha(captcha_secret_key, captcha):
            res = "Invalid captcha"
            return render_template("ticket.html", error_message=res)

        res = is_valid_ticket(id, username)
        if res != "OK":
            return render_template("ticket.html", error_message=res)

        # send request to bot worker
        if ADMIN_COOKIE == "":
            save_admin_cookie()

        r = requests.post("http://bot:5001/",
                          data={"id": id, "cookie": ADMIN_COOKIE})
        app.logger.info(f"[+] Response {r.text}")

        return render_template("ticket.html", error_message=res)
    else:
        return render_template("ticket.html")


@app.route('/')
def home():
    username = session.get('username')
    if username:
        if username == "admin":
            render_template("admin.html")
        return render_template("home.html")
    else:
        return redirect(url_for('login'))

@app.route('/logout')
def logout():
    session.clear()
    return redirect(url_for('home'))


def create_admin_user():
    global admin_password
    admin_username = 'admin'
    admin_user = db.session.get(User, admin_username)
    if not admin_user:
        admin_user = User(username=admin_username, password=admin_password)
        db.session.add(admin_user)
        db.session.commit()
    else:
        admin_password = admin_user.password
        
with app.app_context():
    db.create_all()
    create_admin_user()

if __name__ == '__main__':
    with app.app_context():
        db.create_all()
        create_admin_user()
    app.run(debug=True)
