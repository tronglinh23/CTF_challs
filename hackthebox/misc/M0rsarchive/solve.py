import re
import os
import sys
import zipfile
import string
from PIL import Image

def get_pass(morse_list):
  password = ""
  MORSE_CODE_DICT = { 'A':'.-', 'B':'-...',
                    'C':'-.-.', 'D':'-..', 'E':'.',
                    'F':'..-.', 'G':'--.', 'H':'....',
                    'I':'..', 'J':'.---', 'K':'-.-',
                    'L':'.-..', 'M':'--', 'N':'-.',
                    'O':'---', 'P':'.--.', 'Q':'--.-',
                    'R':'.-.', 'S':'...', 'T':'-',
                    'U':'..-', 'V':'...-', 'W':'.--',
                    'X':'-..-', 'Y':'-.--', 'Z':'--..',
                    '1':'.----', '2':'..---', '3':'...--',
                    '4':'....-', '5':'.....', '6':'-....',
                    '7':'--...', '8':'---..', '9':'----.',
                    '0':'-----', ', ':'--..--', '.':'.-.-.-',
                    '?':'..--..', '/':'-..-.', '-':'-....-',
                    '(':'-.--.', ')':'-.--.-'}
  for i in morse_list:
    for k,v in MORSE_CODE_DICT.items():
      if i == v:
        password += k.lower()
  return password

def get_morse():
  fp = open('./pwd.png', 'rb')
  image = Image.open(fp)
  pixel = list(image.getdata())
  background = pixel[0]
  chars = []
  for i,v in enumerate(pixel):
      if v == background:
              chars.append(" ")
      else:
              chars.append("*")
  output =  "".join(chars)
  output = re.sub(r'^\s*', '', output) # remove space at the beginning of output : ^
  output = re.sub(r'\s*$', '', output) # remove space at the end of output: $
  output = re.sub(r'\*{3}', '-', output) # convert *** into - 
  output = re.sub(r'\*', '.', output) # convert * into .
  output = re.sub(r'\s{2,}', '|', output) # in case of 2 or more characters in morse code we need to separate them with |
  output = re.sub(r'\s', '', output) # remove all left space
  output = output.split('|') # split characters 
  return output

  
def extract_File(num,password):
    zip_path = "flag_" + str(num) + ".zip"
    file = zipfile.ZipFile(zip_path)
    for f in file.namelist():
      try:
        file.extract(f, path = "./", pwd = bytes(password, 'utf-8'))
      except Exception as e:
        print(e)
        exit()
    file.close()

def main():
  for i in range(999,-1,-1):
    print(f"Handle file zip : {i}")
    password = get_pass(get_morse())
    print(password)
    extract_File(i,password)
    os.chdir("./flag")

  fp = open('./flag', 'r')
  flag = fp.readlines()
  print(flag)
  fp.close()
  
if __name__ == "__main__":
  main()





