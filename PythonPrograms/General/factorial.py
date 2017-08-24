'''
Created on Aug 24, 2017

@author: USER
'''

def factorial(n):
    if(n<=0):
        return(1)
    else:
        val = n * factorial(n-1)
        return(val)
ans = 'yes'
while(ans != 'no'):
    n = int(input('Give the number whose factorial you want:'))
    val = factorial(n)
    print('The factorial of the number is:',val)
    ans = input('Want to check more numbers?')
        
        

