def execommand(s,command):
    if(command[0]=='pop'):
        s.pop()
        #print(s)
    elif(command[0]=='remove'):
        s.remove(int(command[1]))
        #print(s)
    elif(command[0]=='discard'):
        s.discard(int(command[1]))
        #print(s)
    else:
        print("wrong command")
    return s

n = int(input())
s = set(map(int, input().split()))
m = int(input())

while(m>=1):

    temp=[str(i)for i in input().strip().split()]
    execommand(s, temp)
    m=m-1
sum=0
for i in map(int,list(s)):
    sum=sum+i
print(sum)



