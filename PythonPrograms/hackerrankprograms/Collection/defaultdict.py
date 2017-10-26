from collections import defaultdict

n, m = [int(x) for x in input().split()]
d = defaultdict(list)

for i in range(n+m):
    if i < n:
        d[input().strip()].append(i + 1)
    else:
        w = input().strip()
        print(" ".join([str(x) for x in d[w]]) if w in d else -1)