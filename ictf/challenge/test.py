import random
import string
password="".join(random.choice(string.ascii_letters) for n in range(20))

print(password)