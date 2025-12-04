day = int(input())
cars = list(map(int, input().split()))

count = 0
for c in cars:
    if c == day:
        count += 1

print(count)