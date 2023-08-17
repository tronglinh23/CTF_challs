from PIL import Image
from PIL import ImageDraw
from pyzbar.pyzbar import decode
from pwn import *

p = remote('134.209.179.69', 32594)
p.recvuntil(b"you got only 3 seconds!")
p.recvuntil(b"\n\n\n")
data = p.recvuntil(b"\n\n").strip(b"\n\n")
lines = data.split(b"\n")  #以"\n"为分隔符分割每一行

#Image.new(mode, size, color) 
img = Image.new("1", (51,51), 1) #创建一个新的图像对象img
#Image.new(mode, size, color) 
#mode: 二值图像,只能是黑色(0)或白色(1)
#size: 51*51像素
#color: 指定了图像的初始颜色，1表示初始时图像中的所有像素块都是白色
draw = ImageDraw.Draw(img)       #创建一个用于在图像上进行绘制的对象draw

y = 0  #初始行数为0
for line in lines:
	line = line.decode("utf-8")  #先将字节流转换为字符串类型，否则对数据进行后续的替换处理
	line = line.replace("\t", "").replace("\n", "")  #去除每一行中的"\t"和"\n"
	line = line.replace("\x1b[7m  \x1b[0m","-")  #替换白色格子为"-"
	line = line.replace("\x1b[41m  \x1b[0m","*") #替换红色格子为"*"
	#print(line) 
	x = 0  #初始列数为0，每次开始新的行数，列数都重新从0开始
	for char in line:
		if char == "*":
			draw.point((x, y), 0)  #填充黑色像素块
		elif char == "-":
			draw.point((x, y), 1)  #填充白色像素块
		else:
			print("character error.")
		x += 1
	y += 1	
img.save("qr.png")  #保存生成的二维码

equation = decode(Image.open("./qr.png"))
equation = equation[0].data.decode() #将字节流类型的数据转为字符串类型
equation = equation.replace("=","").replace("x","*") #去除等号，替换乘号
result = eval(equation)  #计算数学等式

p.recvuntil(b"Decoded string:")
p.sendline(str(result).encode())   #发送等式计算的结果给服务器
p.recv()
flag = p.recv().decode().split("flag:")[1]  #提取服务器返回的flag
print(flag)
p.close()
