import sys
input = sys.stdin.readline
T = int(input())
for _ in range(T):
    s = input().strip()
    stack = []
    is_vps = True
    for ch in s:
        if ch == '(':
            stack.append(ch)
        elif ch == ')':
            if stack:
                stack.pop()
            else:
                is_vps = False
                break
    if is_vps and not stack:
        print("YES")
    else:
        print("NO")