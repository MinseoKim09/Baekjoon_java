import sys
input = sys.stdin.readline
n = int(input())
meetings = []
for _ in range(n):
    a, b = map(int, input().split())
    meetings.append((a, b))
meetings.sort(key=lambda x: (x[1], x[0]))
count = 0
end_time = 0
for start, end in meetings:
    if start >= end_time:
        count += 1
        end_time = end
print(count)