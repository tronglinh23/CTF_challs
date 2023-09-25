from PIL import Image
import itertools, io, os

def create_png(bytes_arr, key, out_dir_path):
    if not os.path.isdir(out_dir_path):
        raise Exception("Output folder ('{}') does not exist!".format(out_dir_path))
    result = [0] * len(bytes_arr)
    for i in range(LEN):
        shifter = int(key[i])
        for j in range(len(bytes_arr) // LEN):
            result[(j * LEN) + i] = bytes_arr[(((j + shifter) * LEN) % len(bytes_arr)) + i]
    img_bytes = io.BytesIO(bytes(result))
    try:
        img = Image.open(img_bytes)
        img.save(os.path.join(out_dir_path, "{}.png".format(key)))
        print ("Key {} produces a valid PNG - Saving".format(key))
    except IOError:
        print ("Key {} produces an invalid PNG - Ignoring".format(key))
        
def to_hex(a):
  return "{:02x}".format(a)


f = open("byte.txt", "r")
byteSplit = list(map(int,f.read().split(" ")))
f.close()
# print(byteSplit)

LEN = 16

key = "0000000000000000"
key = list(key)



list_result = [0x89,0x50,0x4e,0x47,0x0d,0x0a,0x1a,0x0a, 0x00, 0x00, 0x00, 0x0d, 0x49, 0x48, 0x44, 0x52]

possible_key = [[] for x in range(16)]
print(possible_key)
for s in range(16):
  print(f"Test {s}")
  for i in range(10):
    shift = i
    # print(byteSplit[(shift*LEN)%len(byteSplit)+s])
    if(byteSplit[(shift*LEN)%len(byteSplit)+s] == list_result[s]):
      possible_key[s].append(i)
      print(f"Change {s}")


print(possible_key)
for p in itertools.product(*possible_key):
    key = "".join("{}".format(n) for n in p)
    create_png(byteSplit, key, "output")
  
  


# print(len(key))
# list1 = [1,]
# key = "".join(key)
# print(key)  
# for i in range(LEN):
#   shift = ord(key[i]) - 48
#   for j in range(0, int(len(result)/LEN)):
#     result[(j * LEN) + i] = byteSplit[(((j + shift) * LEN) % len(byteSplit)) + i]

# for i in range(int(len(result) / LEN)):
# 	print(" ".join(map(to_hex, result[i*LEN:(i+1)*LEN])))