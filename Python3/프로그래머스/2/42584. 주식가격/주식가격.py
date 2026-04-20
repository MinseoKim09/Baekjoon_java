def solution(prices):
    answer = [0] * len(prices)
    stack = []
    
    for i, price in enumerate(prices):
        while stack and prices[stack[-1]] > price:
            prev = stack.pop()
            answer[prev] = i - prev
        stack.append(i)
        
    for i in stack:
        answer[i] = len(prices) - 1 - i
        
    return answer