from flask import Flask, render_template, url_for, redirect, request, session,render_template_string
from urllib.parse import urlparse


app = Flask(__name__)
app.secret_key = "xxxx"

username = ""
password = ""
black_list=['{{','}}','+','"','()','#',"''","' '",'session','update','popen','os','import','eval','mro','bases','subclasses','init','getitem','attr','|',
'getattribute','reverse','open','read','print','lipsum','decode','class','subprocess','readlines']
flag=open('flag.txt').read()


@app.route('/contact', methods=['GET', 'POST'])
def contact():
    
    name = request.args.get('Name')
    for val in black_list:
        if (val in name ) or (len(name) > 110):
            return "attack detected, i don't like you"
    templates = '''        
    <!DOCTYPE html>
        <html>
          <head>
            <title>Result</title>
          </head>
          <body>
            <p>Thank you ''' + name + ''' for contacting us. We will reply you soon. </p>
          </body>
        </html>'''
    return render_template_string(templates,name=name)

@app.route('/')
def index():
    if 'authed' not in session:
        return render_template('login.html')
    else:
        return render_template('index.html', username=session['username'])

@app.route('/home',methods=['GET', 'POST'])
def home():
    if 'authed' not in session:
        username=request.args.get('username')
        password=request.args.get('password')
        if username and password:
            session['authed'] = True
            session['username'] = username

            return render_template('index.html',username = username)
        else:
            return render_template('login.html')
    if 'admin' in session and session['admin'] == True:
        return render_template('admin_home.html',flag=flag)


    
    return render_template('index.html',username = session['username'])


@app.route('/logout')
def logout():
    if 'authed' in session:
        session.pop('authed')
        session.pop('username')
        if 'admin' in session:
            session.pop('admin')
    return redirect(url_for('index'))


if __name__ == '__main__':
    app.run(host="0.0.0.0", port=5000)