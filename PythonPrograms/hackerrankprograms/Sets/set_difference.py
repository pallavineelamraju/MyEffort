n=int(input())
eng=set(map(int,input().strip().split()))
b=int(input())
french=set(map(int,input().strip().split()))
num=eng.difference(french)
print(len(num))