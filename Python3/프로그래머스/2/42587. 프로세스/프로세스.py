from collections import deque

def solution(priorities, location):
    q = deque((p, i) for i, p in enumerate(priorities))
    answer = 0
    
    while q:
        p, i = q.popleft()
        
        if q and max(q)[0] > p:
            q.append((p, i))
        else:
            answer += 1
            if i == location:
                return answer