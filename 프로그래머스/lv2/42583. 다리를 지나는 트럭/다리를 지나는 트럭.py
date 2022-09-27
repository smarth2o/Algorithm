def solution(bridge_length, weight, truck_weights):
    
    from collections import deque
    
    bridge = deque([0]*bridge_length)
    total = 0
    cnt = 0
    
    while bridge:
        
        cnt += 1
        total -= bridge.popleft()
        
        if truck_weights:
            if total + truck_weights[0] <= weight:
                t = truck_weights.pop(0)
                bridge.append(t)
                total += t
            else:
                bridge.append(0)
                
    return cnt