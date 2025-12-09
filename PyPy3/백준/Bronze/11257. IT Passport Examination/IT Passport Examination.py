import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    num, s, m, t = map(int, input().split())
    total = s + m + t
    
    if total >= 55 and s >= 11 and m >= 8 and t >= 12:
        result = "PASS"
    else:
        result = "FAIL"
    
    print(num, total, result)
