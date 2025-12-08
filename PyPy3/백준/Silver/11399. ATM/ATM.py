n = int(input())
p = list(map(int, input().split()))
p.sort()
total = 0
current = 0
for x in p:
    current += x
    total += current
print(total)