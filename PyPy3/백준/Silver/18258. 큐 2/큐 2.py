from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
queue = deque()  # 큐 초기화

for _ in range(n):
    command = input().split()
    
    # 뒤에 추가
    if command[0] == "push":
        queue.append(int(command[1]))
    
    # 앞 제거 후 출력
    elif command[0] == "pop":
        print(queue.popleft() if queue else -1)
    
    # 큐 길이 출력
    elif command[0] == "size":
        print(len(queue))
    
    # 비어있으면 1
    elif command[0] == "empty":
        print(0 if queue else 1)
    
    # 앞 원소
    elif command[0] == "front":
        print(queue[0] if queue else -1)
         
    # 뒤 원소
    elif command[0] == "back":
        print(queue[-1] if queue else -1)