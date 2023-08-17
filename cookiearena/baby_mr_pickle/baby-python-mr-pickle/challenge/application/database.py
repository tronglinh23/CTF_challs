from flask import g
from application import app
from sqlite3 import dbapi2 as sqlite3
import base64
import pickle


def connect_db():
    return sqlite3.connect('cop.db', isolation_level=None)


def get_db():
    db = getattr(g, '_database', None)
    if db is None:
        db = g._database = connect_db()
        db.row_factory = sqlite3.Row
    return db


def query_db(query, args=(), one=False):
    with app.app.app_context():
        cur = get_db().execute(query, args)
        print(f"Cur: {cur}", flush=True)
        rv = [dict((cur.description[idx][0], value)
                   for idx, value in enumerate(row)) for row in cur.fetchall()]
        return (next(iter(rv[0].values())) if rv else None) if one else rv


class Item:
    def __init__(self, name, price, image):
        self.name = name
        self.image = image
        self.price = price
        

def migrate_db():
    items = [
        Item('Dưa Cầu Giấy', '23', '/static/images/caugiay.jpg'),
        Item('Dưa Triều Khúc', '27', '/static/images/trieukhuc.jpg'),
        Item('Dưa Thạch Thất', '1337', '/static/images/thachthat.jpg'),
        Item('Dưa Thanh Xuân', '7.30', '/static/images/thanhxuan.jpg')
    ]

    with open('schema.sql', mode='r') as f:
        shop = map(lambda x: base64.b64encode(pickle.dumps(x)).decode(), items)
        get_db().cursor().executescript(f.read().format(*list(shop)))
