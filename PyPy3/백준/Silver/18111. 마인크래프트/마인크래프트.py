import sys
input = sys.stdin.readline
n, m, b = map(int, input().split())
cnt = [0] * 257
min_h = 256
max_h = 0
for _ in range(n):
    for h in map(int, input().split()):
        cnt[h] += 1
        min_h = min(min_h, h)
        max_h = max(max_h, h)
best_time = float('inf')
best_height = 0
for h in range(min_h, max_h + 1):
    remove = 0
    add = 0
    for height in range(257):
        if cnt[height] == 0:
            continue
        if height > h:
            remove += (height - h) * cnt[height]
        elif height < h:
            add += (h - height) * cnt[height]
    if remove + b < add:
        continue
    time = remove * 2 + add
    if time < best_time or (time == best_time and h > best_height):
        best_time = time
        best_height = h
print(best_time, best_height)