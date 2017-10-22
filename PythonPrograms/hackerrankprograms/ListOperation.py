
def execute(list,commands):
  if (commands[0]=="insert"):
     list.insert(int(commands[1]),int(commands[2]))
  elif(commands[0]=="append"):
     list.append(int(commands[1]))
  elif(commands[0]=="remove"):
     list.remove(int(commands[1]))
  elif(commands[0]=="pop"):
     list.pop()
  elif(commands[0]=="reverse"):
     list.reverse()
  elif(commands[0]=="sort"):
     list.sort()
  elif(commands[0]=="print"):
     print(list)
  else:
     print("wrong command")

list=[]
n=int(input())

while(n>=1):
    temp = [str(i) for i in input().strip().split()]
    execute(list, temp)
    n = n-1

# insert 0 5
# insert 1 10
# insert 0 6
# print
# remove 6
# append 9
# append 1
# sort()
# print
# pop()
# reverse()
# print
