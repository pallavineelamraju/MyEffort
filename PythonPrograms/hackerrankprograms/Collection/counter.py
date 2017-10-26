
import collections

N=int(input())
sizes = collections.Counter(map(int,input().strip().split()))
print(sizes)
cust=int(input())
money=0
for i in range(cust):
    (size,cost)=map(int,input().strip().split())
    print(sizes[size])
    if sizes[size]>0:
        sizes[size]-=1
        money+=cost
print(money)