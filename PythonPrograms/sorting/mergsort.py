'''
Created on Aug 31, 2017

@author: USER
'''
def merge(A,B):
    (C,m,n)= ([],len(A),len(B))
    (i,j)= (0,0)
    while(i+j<m+n):
        if i == m:
            C.append(B[j])
            j=j+1
        elif j == n:
            C.append(A[i])
            i=i+1
        elif A[i]<=B[j]:
            C.append(A[i])
            i=i+1
        elif A[i]>B[j]:
            C.append(B[j])
            j=j+1
    return(C)
    
def mergesort(seq):
     
    if len(seq)==0 or len(seq)== 1:
        return seq
    else:
        mid= len(seq)//2
        L = mergesort(seq[:mid])
        R = mergesort(seq[mid:])
    return(merge(L,R))
try:    
    num = int(input('Enter number of elements in the list:'))
    seq=[] 
    print('Enter the numbers in the list:')
    k = 0
    for k in range(num):
        x=int(input())
        seq.insert(k,x)
        k+=1
except ValueError:
        print('Invalid input')
else:
    C = mergesort(seq)
    print('The sorted list is:')
    print(C)
