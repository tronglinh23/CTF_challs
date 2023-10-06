import string
import random

ALPHABET = string.ascii_uppercase



def generate_key():
    return [random.randint(0, 26) for _ in range(13)]


def generate_keystream(key, length):
    keystream = []
    while len(keystream) < length:
        keystream.extend(key)
        key = key[1:] + key[:1]
    return keystream

def encrypt(message, key):
    indices = [ALPHABET.index(c) if c in ALPHABET else c for c in message.upper()]
    print(indices)
    keystream = generate_keystream(key, len(message))
    encrypted = []

    for i in range(len(indices)):
        if isinstance(indices[i], int):
            encrypted.append(ALPHABET[(keystream[i] + indices[i]) % 26])
        else:
            encrypted.append(indices[i])

    return "".join(encrypted)


# with open("plaintext.txt", "r") as f:
#     plaintext = f.read()

# key = generate_key()
# print(key)
# ciphertext = encrypt(plaintext, key)

# with open("test.txt", "w") as f:
#     f.write(ciphertext)


# def generate_keystream(key, length):
#     keystream = []
#     while len(keystream) < length:
#         keystream.extend(key)
#         key = key[1:] + key[:1]
#         # print(key)
#     return keystream

# print(generate_keystream([1,2,3,4,5], 10))

text = "OJUIMBBQXAMI VVW KKVEFNWDMXAG BKIQQJIUI"
text1 = list(text)
print(''.join(text1[:13]))
print(''.join(text1[13:26]))
print(''.join(text1[26:40]))

# V I cung key 
# 
print(ALPHABET.index('O'))
print(ALPHABET.index('V'))
# print(ALPHABET.index('U'))

# (x + y) mode 26 = 14
# (x + z) mode 26 = 12
# (y - z) mode 26 = 2
print(ALPHABET.index('M') - 13)
# ALP[x] + indice[0] = O
# ALP[' '] + indice[0] = M
# ALP[x] + indice[1] = V


