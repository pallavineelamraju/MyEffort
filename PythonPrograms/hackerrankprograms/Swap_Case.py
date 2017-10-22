def findcase(words):

    str=""
    for i in words:
      str=str+i.swapcase()+" "

    return str

x=input()
if(0<len(x)<=1000):
  words=[i for i in x.split(' ')]
  print(findcase(words))