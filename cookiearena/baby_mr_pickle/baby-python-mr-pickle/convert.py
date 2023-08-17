str = ["chh{pY7hoN_PicK1e_rCE_d3A35D8746009d1f4FDdcd9a6edf2296}"
,"CHH{PY7HOn_PICK1e_RcE_D3a35D8746009D1f4FDdCD9a6edf2296}"
,"CHH{py7Hon_PICk1E_rce_d3a35D8746009d1f4FddCD9A6eDf2296}"
,"CHH{pY7hON_PICk1E_RcE_d3a35d8746009d1f4fddcd9a6edf2296}"]
for i in range(len(str)):
    if(str[i].islower()):
      str[i] = str[i]
    elif(str[i].isupper()):
      str[i] = str[i].lower()
print(str)

