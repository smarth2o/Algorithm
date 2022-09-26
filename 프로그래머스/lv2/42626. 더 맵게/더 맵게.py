import heapq

def solution(scoville, K):
    
    heapq.heapify(scoville)
    
    cnt = 0
    while len(scoville) >= 2:
        
        low = heapq.heappop(scoville)
        
        if low >= K:
            return cnt
        else:
            nxt = heapq.heappop(scoville)
            heapq.heappush(scoville, low + nxt*2)
            cnt += 1
            
    if scoville[0] >= K:
        return cnt
    else:
        return -1
            