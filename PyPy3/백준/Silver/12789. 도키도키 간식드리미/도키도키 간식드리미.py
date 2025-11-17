from collections import deque
n = int(input())
line = deque(map(int, input().split()))
stack = []
next_num = 1
while line:
    if line[0] == next_num:
        line.popleft()
        next_num += 1
    elif stack and stack[-1] == next_num:
        stack.pop()
        next_num += 1
    else:
        stack.append(line.popleft())
while stack and stack[-1] == next_num:
    stack.pop()
    next_num += 1
print("Nice" if next_num == n + 1 else "Sad")