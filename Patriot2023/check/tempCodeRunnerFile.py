cnt = 0
# for a, b in v1:
#         for e, f in v3:
#             x = "".join([chr(i) for i in [a, 'a', b, e, 'a', f]])
#             req = requests.post(
#                 "http://chal.pctf.competitivecyber.club:9096/check.php", data={"password": x})
#             if "incorrect password" not in req.text:
#                 print(req.text)
#                 exit()
#             print("\r%d %s" % (cnt, x), end="")
#             cnt +=1