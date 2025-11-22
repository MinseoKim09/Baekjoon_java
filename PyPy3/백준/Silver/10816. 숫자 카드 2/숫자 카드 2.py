import sys
input = sys.stdin.readline

N = int(input())
cards = list(map(int, input().split()))
M = int(input())
targets = list(map(int, input().split()))
count = {}
for num in cards:
    if num in count:
        count[num] += 1
    else:
        count[num] = 1
result = []
for t in targets:
    result.append(str(count.get(t, 0)))
print(" ".join(result))