from cryptography.hazmat.primitives import hashes, hmac
from cryptography.hazmat.backends import default_backend

ENCRYPTION_KEY = "corctf{test}"
def hmac_sha256(data):
    h = hmac.HMAC(ENCRYPTION_KEY, hashes.SHA256(), backend=default_backend())
    h.update(data)
    return h.finalize().hex()

print(hmac_sha256("test").decode())