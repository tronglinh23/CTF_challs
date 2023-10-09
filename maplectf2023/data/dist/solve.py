import re
data = open('x.in', 'r').read()
pattern = r'<td>(\d+)</td>'
test = matches = re.findall(pattern, data)
poss = [int(x) for x in test]
abc = '0123456789abcdef'
print(len(abc))
index = 0
d = ['x']*128
print(d)
for pos in poss:
    print(index, pos)
    if index+1 == pos and index<=15:
        index += 1
    else:
        d[pos-17] = abc[index-1]
print("".join(d))

#key: 36d35d32d1c43cfc1d3342d5992f0a9f6b1d32325fc9fb4c640c97ab81ad0b4df8b3232a37aa2aef5d04e501466fa04760fc3b2abf1a076215f8653bf830b568de0c7f103c05c23ca88ef88fb72eeb589ca824c428423a0c1dafffc87cd2d1621d8fcab51a376c9d97cb2016efa034d9ee9cc3f510652ab85ecf20816e0c5453

# 36d35d32d1c43cfc1d3342d5992f0a9f6b1d32325fc9fb4c640c97ab81ad0b4df8b3232a37aa2aef5d04e501466fa04760fc3b2abf1a076215f8653bf830b568de0c7f103c05c23ca88ef88fb72eeb589ca824c428423a0c1dafffc87cd2d1621d8fcab51a376c9d97cb2016efa034d9ee9cc3f510652ab85ecf20816e0c5453