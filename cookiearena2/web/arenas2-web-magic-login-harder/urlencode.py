import requests
import argparse
import sys
import urllib.parse
import subprocess
import os, sys, re
import binascii
import base64
import string, hashlib, time

def md5_collisions():
    try:    
        with open("evilize/good", "rb") as f2, open("evilize/evil", "rb") as f3:
            try:
                return ((urllib.parse.quote(f2.read()), urllib.parse.quote(f3.read())))
            except:
                print("[-] Cannot encode collisions files")
                sys.exit()
    except:
        print("[-] Cannot find md5 collisions files: f1, f2")
        sys.exit()
        
def login(target):
    # url = requests.get(target)
    # username = open("text1").read()
    # password = open("text2").read()
    username, password = md5_collisions()
    # print(base64.b64encode(username))
    headers= { "Content-Type" : "application/x-www-form-urlencoded"}
    data = {
        "username": base64.b64encode(username.encode('utf-8')).decode('utf-8'),
        "password": base64.b64encode(password.encode('utf-8')).decode(('utf-8')),
        "submit": "login"
    }
    # data = "username={}&password={}&submit=login".format(base64.b64encode(username.encode('utf-8')).decode('utf-8'),base64.b64encode(password.encode('utf-8')).decode(('utf-8')))
    # data = "username={}&password={}&submit=login".format(username,password)    
    res = requests.post(target, json=data, allow_redirects=True, verify=False)
    return res.text

print(login("http://localhost:1337/index.php"))


# #!/usr/bin/python3
# import sys
# import urllib.parse

# if len(sys.argv) < 1:
#     print("[-] Missing file name")
# else:
#     try:    
#         with  open(sys.argv[1],'rb') as f:
#             contents = f.read()
#             url = urllib.parse.quote(contents)
#             print("[+] Urlencoded file:")
#             print(url)
#     except Exception as e:
#         print("[-] Could not open file")
#         print(e)