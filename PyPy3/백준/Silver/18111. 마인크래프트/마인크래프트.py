import sys
input = sys.stdin.readline
N, M, B = map(int, input().split())
land = []
min_h = 256
max_h = 0
for _ in range(N):
    row = list(map(int, input().split()))
    land.append(row)
    min_h = min(min_h, min(row))
    max_h = max(max_h, max(row))
best_time = float('inf')
best_height = 0
for h in range(min_h, max_h + 1):
    remove = 0
    add = 0
    for i in range(N):
        for j in range(M):
            diff = land[i][j] - h
            if diff > 0:
                remove += diff
            else:
                add -= diff
    if remove + B < add:
        continue
    time = remove * 2 + add
    if time < best_time or (time == best_time and h > best_height):
        best_time = time
        best_height = h
print(best_time, best_height)