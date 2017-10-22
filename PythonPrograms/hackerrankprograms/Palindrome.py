
def reverse(s):
    length=len(s)
    for i in s[0:length]:
        l=s[::-1]
        return l
def palindrome(s):
    l=list(s)
    return l

n=input("Enter the string:")
c=reverse(n)
print(c)
if(c == n):
    print("Palindrome")
else:
    print("Not Palindrome")

m=input("enter name: ")
p=palindrome(m)
str1=''.join(p)
n=list(reversed(p))
str2=''.join(n)
if(str1==str2):
    print("palindrome")
else:
    print("not palindrome")


