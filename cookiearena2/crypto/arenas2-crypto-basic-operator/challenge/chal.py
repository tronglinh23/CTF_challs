from Crypto.Util import number
import math
import functools

def padding_pkcs7(data,block_size=4):
	tmp = len(data) + (block_size - len(data) % block_size)
	return data.ljust(tmp,bytes([block_size-(len(data)%block_size)]))

def split_block(data,block_size):
	return list(int.from_bytes(data[i:i+block_size],'little') for i in range(0,len(data),block_size))

def plus_func(data,shift):
	return (data+shift)&0xffffffff

def mul_func(data,mul):
	return (data*mul)&0xffffffff

def xor_shift_right_func(data,bit_loc):
  return (data^(data>>bit_loc))&0xffffffff

def pow_func(data,e,p):
	return pow(data,e,p)

def exp_func(data,base,p):
	return pow(base,data,p)

def ecb_mode(data):
	return list(pow_func(exp_func(xor_shift_right_func(mul_func(plus_func(block,3442055609),2898124289),1),e,p),e,p) for block in split_block(padding_pkcs7(data,4),4))

def ecb_mode2(data):
	return list(xor_shift_right_func(mul_func(plus_func(block,3442055609),2898124289),1) for block in split_block(padding_pkcs7(data,4),4))

if __name__=='__main__':
	p = 1341161101353773850779
	e = 2
	mess = b'CHH{CENSORED}'
	cipher_flag = ecb_mode(mess)
	print(f"first:{padding_pkcs7(mess,4)}")
	print(f"second:{split_block(padding_pkcs7(mess,4),4)}")
	print(f"third:{plus_func(2068334659,3442055609)}")
	print(f"fourth:{mul_func(plus_func(2068334659,3442055609),2898124289)}")
	print(f"fifth:{xor_shift_right_func(mul_func(plus_func(2068334659,3442055609),2898124289),1)}")
	print(f"sixth:{exp_func(xor_shift_right_func(mul_func(plus_func(2068334659,3442055609),2898124289),1),2,p)}")
	print(f"seventh:{pow_func(exp_func(xor_shift_right_func(mul_func(plus_func(2068334659,3442055609),2898124289),1),2,p),2,p)}")
	
	print(cipher_flag)
	# print(math.log(752589857254588976778,4))
	# for i in range(0,1000):
	# 	if(pow(4,i) > 1341161101353773850779):
	# 		print(i)
	# 		break
	# print(pow(4,40,1341161101353773850779))
	# print(pow(4,701324546,1341161101353773850779))
"""
a , e , p
d = pow(e,a,p) d = e^a mod p
f = pow(d,e,p) f = d^e mod p => f = e^(a*e) mod p => f = e^ae mod p => f = 2^2a mod p
log
"""


#solution
#step1
# def combine_blocks(blocks, block_size):
#     data = b"".join(block.to_bytes(block_size, 'little') for block in blocks)
#     return data

#step2
# def minus_func(return_value, shift):
#     return (return_value - shift) & 0xffffffff

# return_value = 1215422972
# shift = 3442055609

# plain_data = minus_func(return_value, shift)
# print(plain_data)


#step3
# def div_func(data, mul):
#     # Inverse operation of multiplication is division modulo 2^32
#     # Since there is no native division operator for integers modulo 2^32 in Python,
#     # we need to use the Extended Euclidean Algorithm to calculate the modular inverse.
#     inv_mul = number.inverse(mul, 2**32)
#     return (data * inv_mul) & 0xffffffff

# return_value = 829843964
# mul = 2898124289

# plain_data = div_func(return_value, mul)
# print(plain_data)

#step4
# def reverse_xor_shift_right(return_value, bit_loc): 
# 	x = return_value
# 	x ^= x >> 1
# 	x ^= x >> 2
# 	x ^= x >> 4
# 	x ^= x >> 8
# 	x ^= x >> 16
# 	return x
# return_value = 701324546
# bit_loc = 1

# plain_data = reverse_xor_shift_right(return_value, bit_loc)
# print(plain_data)

#step5
from Crypto.Util.number import inverse, long_to_bytes
# from sympy.ntheory import discrete_log
from sage.all import *

def rev_pow_func(data,e,p):
    return mod(data, p).sqrt(all=True)
	# return modular_sqrt(data, p)

def rev_exp_func(data,base,p):
  R = IntegerModRing(p)
  x = discrete_log(R(data), R(base))
  return x

print(rev_exp_func(rev_pow_func(701324546,2,1341161101353773850779),2,1341161101353773850779)))


