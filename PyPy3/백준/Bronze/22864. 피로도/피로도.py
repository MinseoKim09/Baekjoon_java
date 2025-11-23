a, b, c, m = map(int, input().split())
fatigue = 0
work_done = 0
for _ in range(24):
    if fatigue + a <= m:
        fatigue += a
        work_done += b
    else:
        fatigue = max(fatigue - c, 0)
print(work_done)