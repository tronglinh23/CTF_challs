import sqlite3
import codecs

def quote_identifier(s, errors="strict"):
    # https://stackoverflow.com/questions/6514274/how-do-you-escape-strings-for-sqlite-table-column-names-in-python
    encodable = s.encode("utf-8", errors).decode("utf-8")

    nul_index = encodable.find("\x00")

    if nul_index >= 0:
        error = UnicodeEncodeError(
            "NUL-terminated utf-8",
            encodable,
            nul_index,
            nul_index + 1,
            "NUL not allowed",
        )
        error_handler = codecs.lookup_error(errors)
        replacement, _ = error_handler(error)
        encodable = encodable.replace("\x00", replacement)

    return '"' + encodable.replace('"', '""') + '"'

def test_identifier(identifier):
    "Tests an identifier to ensure it's handled properly."

    with sqlite3.connect(":memory:") as c:
        c.execute("CREATE TABLE " + quote_identifier(identifier) + " (foo)")
        assert identifier == c.execute("SELECT name FROM SQLITE_MASTER").fetchone()[0]

test_identifier("'Héllo?'\\\n\r\t\"Hello!\" -☃") # works
test_identifier("北方话") # works
test_identifier(chr(0x20000)) # works

# print(quote_identifier("Fo\x00o!", "replace")) # prints "Fo?o!"
# print(quote_identifier("Fo\x00o!", "ignore")) # prints "Foo!"
# print(quote_identifier("Fo\x00o!")) # raises UnicodeEncodeError
# print(quote_identifier(chr(0xD800))) # raises UnicodeEncodeError

def format_order(order: tuple[str, str]) -> str:
    col_name, direction = order
    assert direction.upper() in ["ASC", "DESC"]
    return "%s %s" % (quote_identifier(col_name), direction)
  
order = ("UNION SELECT 1--", "asc")
print(format_order(order)) # raises AssertionError


def select_from(
      table_name: str,
      orders: list[tuple[str, str]],
  ):
      query = "SELECT * FROM %s" % quote_identifier(table_name)
      params = []
      if orders:
          query += " ORDER BY %s" % ", ".join(format_order(f) for f in orders)
      return query, params

print(select_from("foo", [("北方话", "asc")]))