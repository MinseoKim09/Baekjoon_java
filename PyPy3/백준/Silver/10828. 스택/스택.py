import sys
input = sys.stdin.readline
stack = []
N = int(input())
for _ in range(N):
    command = input().split()
    if command[0] == "push":
        value = int(command[1])
        stack.append(value)
    elif command[0] == "pop":
        print(stack.pop() if stack else -1)
    elif command[0] == "size":
        print(len(stack))
    elif command[0] == "empty":
        print(0 if stack else 1)
    elif command[0] == "top":
        print(stack[-1] if stack else -1)