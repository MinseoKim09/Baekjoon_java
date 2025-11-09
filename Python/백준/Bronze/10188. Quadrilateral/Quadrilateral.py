t = int(input())

for i in range(t):
    length, width = map(int, input().split())
    for _ in range(width):
        print("X" * length)
    if i != t - 1:
        print()