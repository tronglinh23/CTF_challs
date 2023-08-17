def rotate_string(password):
    return password[1:] + password[0]

def is_possible_rotation(original_password, new_password):
    forward_rotation = original_password
    backward_rotation = original_password[::-1]

    for _ in range(len(original_password)):
        forward_rotation = rotate_string(forward_rotation)
        backward_rotation = rotate_string(backward_rotation)
        if forward_rotation == new_password or backward_rotation == new_password:
            return "MAYBE"
    
    return "NO"

# Nhập dữ liệu từ người dùng
original_password = input()
new_password = input()


if (original_password == new_password):
    print("NO")
    exit()
if (len(original_password) != len(new_password)):
    print("NO")
    exit()
elif len(original_password) >= 200 or len(new_password) >= 200:
    print("NO")
    exit()

# Kiểm tra và in kết quả
result = is_possible_rotation(original_password, new_password)
print(result)



