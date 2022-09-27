def solution(prices):
    
    from collections import deque
    
    prices = deque(prices)
    ans = []
    
    while prices:
        p = prices.popleft()
        cnt = 0
        
        for price in prices:
            cnt += 1
            
            if p > price:
                break
        
        ans.append(cnt)
    
    return ans