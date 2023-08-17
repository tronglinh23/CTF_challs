# solution
# step1
from Crypto.Util import number
import math
import functools
def combine_blocks(blocks, block_size):
    data = [block.to_bytes(block_size, 'little') for block in blocks]
    return data

# step2
def minus_func(return_value, shift):
    return (return_value - shift) & 0xffffffff


# step3
def div_func(data, mul):
    # Inverse operation of multiplication is division modulo 2^32
    # Since there is no native division operator for integers modulo 2^32 in Python,
    # we need to use the Extended Euclidean Algorithm to calculate the modular inverse.
    inv_mul = number.inverse(mul, 2**32)
    return (data * inv_mul) & 0xffffffff


# step4
def reverse_xor_shift_right(return_value): 
	x = return_value
	x ^= x >> 1
	x ^= x >> 2
	x ^= x >> 4
	x ^= x >> 8
	x ^= x >> 16
	return x

def reverse_all(cipher_text, p):
    list = []
    for num in cipher_text:
        list.append(minus_func(div_func(reverse_xor_shift_right(num),2898124289),3442055609))
    result = combine_blocks(list, 4)
    return result


if __name__ == '__main__':
    p = 1341161101353773850779
    e = 2
    
    arr = [701324546, 670580550677588249935, 3197098920, 670580550680084024309, 1095769757, 670580550677982695146, 670580550679122333013, 2235407624, 1160535729, 670580550678047461118, 400850331, 670580550677287775720, 3025264424, 670580550679912189813, 670580550681082580064, 4195654675, 670580550677598308990, 711383601, 670580550677336688353, 449762964, 3779431483, 670580550680666356872, 670580550679338422247, 2451496858]

    result = reverse_all(arr,p)
    print((result[0] + result[2] + result[4]+result[7]+result[8]+result[10]+result[12]+result[15]+result[17]+result[19]+result[20]+result[23]).decode())
    
