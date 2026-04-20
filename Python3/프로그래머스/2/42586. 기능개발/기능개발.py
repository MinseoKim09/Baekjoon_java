from collections import deque

def solution(progresses, speeds):
    q = deque((100 - p + s - 1) // s for p, s in zip(progresses, speeds))
    
    answer = []
    
    while q:
        cur = q.popleft()
        cnt = 1
        
        while q and q[0] <= cur:
            q.popleft()
            cnt += 1
        
        answer.append(cnt)
    
    return answer