f = open('data.txt', 'r')
r = f.read()
r = r.split("\n")
result = b''
for i in r:
  # print(i)
  i = i[8:]
  result += bytes.fromhex(i)
 
result = result.replace(b'\x0d\x0a', b'\x0a')
result = result.replace(b'\x0d\x00', b'\x0d')

open('flag.pdf', 'wb').write(result)