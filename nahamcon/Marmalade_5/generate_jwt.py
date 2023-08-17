import hmac
import hashlib
import base64

def remove_padding(encoded_string):
    return encoded_string.rstrip("=")
  
def generate_jwt(secret_key):
    header = 'eyJhbGciOiJNRDVfSE1BQyJ9'
    payload = 'eyJ1c2VybmFtZSI6ImFkbWluIn0' #remove = in base64 encode
    
    encoded_token = header + '.' + payload
    
    generate_signature = hmac.new(secret_key.encode('utf-8'), encoded_token.encode('utf-8'), hashlib.md5).digest()
    encoded_signature = remove_padding(base64.urlsafe_b64encode(generate_signature).decode('utf-8'))
    
    encoded_jwt = encoded_token + '.' + encoded_signature 
  
    return encoded_jwt
  
print(generate_jwt('fsrwjcfszegvsyfa'))