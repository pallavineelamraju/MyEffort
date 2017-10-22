def count_substring(string,sub_string):
    l=len(sub_string)
    count=0
    for i in range(0,len(string)):
        if(string[i:i+len(sub_string)] == sub_string ):
            count+=1
    return count

str=input()
if(1<=len(str)<=200):
    substr=input()
    print(count_substring(str,substr))
else:
    print("string length is out of range")
