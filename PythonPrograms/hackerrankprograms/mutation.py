def mutate_string(string, position, character):
    string=string[0:position]+character+string[position+1:]
    return string

str = input()
poschar = input().split()
print(mutate_string(str,int(poschar[0]),poschar[1]))