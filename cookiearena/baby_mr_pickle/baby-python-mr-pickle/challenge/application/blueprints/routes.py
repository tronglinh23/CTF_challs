from flask import Blueprint, render_template
from application.models import shop

web = Blueprint('web', __name__)


@web.route('/')
def index():
    return render_template('index.jinja2', products=shop.all_products())


@web.route('/view/<product_id>')
def product_details(product_id):
    print(f"product_id: {product_id}", flush=True)
    return render_template('item.jinja2', product=shop.select_by_id(product_id))
