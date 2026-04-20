from collections import deque

def solution(bridge_length, weight, truck_weights):
    bridge = deque([0] * bridge_length)
    trucks = deque(truck_weights)
    
    time = 0
    current_weight = 0
    
    while bridge:
        time += 1
        current_weight -= bridge.popleft()
        
        if trucks:
            if current_weight + trucks[0] <= weight:
                t = trucks.popleft()
                bridge.append(t)
                current_weight += t
            else:
                bridge.append(0)
        else:
            if current_weight == 0:
                break
            bridge.append(0)
    
    return time