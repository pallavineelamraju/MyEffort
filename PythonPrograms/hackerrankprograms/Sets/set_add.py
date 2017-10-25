N=int(input())
l=[]
while(N>=1):
    s=input()
    l.append(s)
    N=N-1
c=len(set(l))
print(c)



