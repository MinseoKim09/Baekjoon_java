import heapq

def solution(k, score):
    h = []
    answer = []
    
    for s in score:
        heapq.heappush(h, s)
        
        if len(h) > k:
            heapq.heappop(h)
        
        answer.append(h[0])
    
    return answer