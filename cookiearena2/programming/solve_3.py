def tim_uoc_chung(n):
  list = []
  for i in range(1,n+1):
    if n % i == 0:
      list.append(i)
  
  return list

def reverse_string(s):
  return s[::-1]


# Nhập độ dài mật khẩu
n = int(input("Nhập độ dài mật khẩu: "))


# Nhập mật khẩu đã được mã hoá
encoded_password = input("Nhập mật khẩu đã được mã hoá: ").strip()

result = encoded_password
final_result = ""
uoc_chung = tim_uoc_chung(n)
for i in uoc_chung:
  result = reverse_string(result[0:i])+result[i:]
# Giải mã mật khẩu
print(result)
