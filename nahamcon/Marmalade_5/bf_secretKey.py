import hmac
import hashlib
import base64

jwt_token = 'eyJhbGciOiJNRDVfSE1BQyJ9.eyJ1c2VybmFtZSI6InMifQ.49BQc1Pj96LW8tUhAHXzYA'


def remove_padding(encoded_string):
    return encoded_string.rstrip("=")

def generate_jwt(secret_key):
    header, payload, signature = jwt_token.split('.')
    
    encoded_token = header + '.' + payload
    
    generate_signature = hmac.new(secret_key.encode('utf-8'), encoded_token.encode('utf-8'), hashlib.md5).digest()
    encoded_signature = remove_padding(base64.urlsafe_b64encode(generate_signature).decode('utf-8'))
    
    encoded_jwt = encoded_token + '.' + encoded_signature 
  
    return encoded_jwt
  
secret_found = None
with open ('list_secret.txt', 'r') as r:
  for line in r:
    if generate_jwt(line.strip()) == jwt_token:
      secret_found =  line.strip()
      break

if secret_found:
  print('Secret key found: ' + secret_found)
else:
  print('Secret key not found')