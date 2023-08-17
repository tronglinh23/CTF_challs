import itertools
import string

characters = string.ascii_lowercase
permutations = itertools.permutations(characters, 5)

with open('list_secret.txt','w') as w:
  for perm in permutations:
    w.write('fsrwjcfszeg' + ''.join(perm) + '\n')
    