import sys
lines = sys.stdin.readlines()
line0 = int((lines[0]).strip())
line1 = [int(c) for c in lines[1].strip().split(' ')]

max_vote = -1
sum = 0
count = 0
for i in line1:
    sum += i
    max_vote = max(i,max_vote)

stt = 0
for k in range(len(line1)):
    if line1[k] >= sum/2:
      print(f"chose {k+1}")
      exit()
    elif line1[k] == max_vote:
      count += 1
      stt = k

if count > 1:
  print("no winner")
else:
  print(f"consider {stt+1}")
  