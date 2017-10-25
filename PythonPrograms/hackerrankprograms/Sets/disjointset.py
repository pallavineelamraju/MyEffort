n,m=(int(i)for i in input().split())
array=map(int,input().split())
A=set(map(int,input().split()))
B=set(map(int,input().split()))
flag=0
for i in array:
    if i in A:
        flag+=1
    if i in B:
        flag+=-1

print(flag)


