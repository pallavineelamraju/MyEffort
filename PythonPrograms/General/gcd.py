def gcd(m,n):
    if(m < n):
        (m,n) = (n,m)
    if(m%n == 0):
        return(n)
    else:
        return(gcd(n,(m%n)))
        
num1 = int(input("Give one the GCD numbers:"))
num2 = int(input("Give the second GCD number:"))
k = gcd(num1,num2)
print('The gcd is:')
print(k)