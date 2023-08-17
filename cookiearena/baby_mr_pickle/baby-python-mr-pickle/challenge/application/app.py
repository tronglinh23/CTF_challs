from flask import Flask, g
from application.blueprints.routes import web
import pickle
import base64
import os

app = Flask(__name__)
app.config.from_object('application.config.Config')

app.register_blueprint(web, url_prefix='/')


@app.template_filter('pickle')
def pickle_loads(s):
    print("pickle:", pickle.loads(base64.b64decode(s)), flush=True)
    return pickle.loads(base64.b64decode(s))


@app.teardown_appcontext
def close_connection(exception):
    db = getattr(g, '_database', None)
    if db is not None:
        db.close()
