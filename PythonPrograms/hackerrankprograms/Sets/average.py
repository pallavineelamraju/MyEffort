def average(array):
    l=set(array)
    sum=0
    for i in l:
        sum=sum+int(i)
        avg=sum/len(l)
    return avg

n=int(input())
if(0<n<=100):
    list=input().strip().split()
    if(len(list)==n):
       print(average(list))
