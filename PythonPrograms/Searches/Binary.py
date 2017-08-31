'''
Created on Aug 30, 2017

@author: USER
'''

def binarySearch(alist, item):
    first = 0
    last = len(alist)-1
    found = False
    while first<=last and not found:
        midpoint = (first + last)//2
        if alist[midpoint] == item:
            found = True
            print('Found at position:',+(midpoint+1))
            return midpoint
        else:
            if item < alist[midpoint]:
                last = midpoint-1
            else:
                first = midpoint+1
        
                 
    print('Element not found')


num = int(input('Enter number of elements in the list:'))
list=[] 
for i in range (num):
    x=int(input("enter no. \n")) 
    list.insert(i,x)
    i+=1
print(list) 
print(len(list))
#seq = int(input("Enter Your List please :"))
item = int(input('Enter the number to search:'))
binarySearch(list,item)  


    
        
    