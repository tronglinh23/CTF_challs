data = open('x.in', 'r').read()
data2 = data.replace('\t', '').replace('\n', '').split('a')[1:]
poss = [int(x) for x in data2]
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