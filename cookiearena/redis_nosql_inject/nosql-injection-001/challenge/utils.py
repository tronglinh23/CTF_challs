import os


def send_mail(email, authcode):
    return True


FLAG = open("/flag.txt", "r").read()
SECRET = os.urandom(32)
