name = """{% with a = request['application']['\x5f\x5fglobals\x5f\x5f']['\x5f\x5fbuiltins\x5f\x5f'] %}"""

black_list=['{{','}}','+','"','()','#',"''","' '",'session','update','popen','os','import','eval','mro','bases','subclasses','init','getitem','attr','|',
'getattribute','reverse','open','read','print','lipsum','decode','class','subprocess','readlines']

for val in black_list:
  if (val in name ) or (len(name) > 110):
    print("attack detected, i don't like you")
    print(val)
    print(len(name))