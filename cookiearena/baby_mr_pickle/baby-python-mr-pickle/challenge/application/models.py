from application.database import query_db


class shop(object):

    @staticmethod
    def select_by_id(product_id):
        print(f"SELECT data FROM products WHERE id='{product_id}'", flush=True)
        return query_db(f"SELECT data FROM products WHERE id='{product_id}'", one=True)

    @staticmethod
    def all_products():
        return query_db('SELECT * FROM products')
