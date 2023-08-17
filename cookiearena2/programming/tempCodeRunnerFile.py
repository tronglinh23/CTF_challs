def secure_phone_number(phone_number):
    return phone_number[:2] + "*" * (len(phone_number) - 5) + phone_number[-3:]

def secure_email(email):
    username, domain = email.split("@")
    
    if len(username) <= 7:
        return username[0] + "*" * (len(username) - 2) + username[-1] + "@" + domain
    else:
        return username[:2] + "*" * (len(username) - 5) + username[-3:] + "@" + domain

# Nhập số lượng thông tin cần che
n = int(input())

# Lưu thông tin đã che vào danh sách
secured_info = []

# Nhập và che thông tin
for _ in range(n):
    info = input()
    
    if "@" in info:
        secured_info.append(secure_email(info))
    else:
        secured_info.append(secure_phone_number(info))

# In danh sách thông tin đã che
for info in secured_info:
    print(info)
