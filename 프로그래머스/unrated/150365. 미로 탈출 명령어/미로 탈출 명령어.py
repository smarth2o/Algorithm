import sys
sys.setrecursionlimit(10**6)

def solution(n, m, x, y, r, c, k):
    
    dir = {'d':[1, 0], 'l':[0, -1], 'r':[0, 1], 'u':[-1, 0]}
    answer = ""
    
    def dfs(x, y, temp):
        nonlocal answer
        
        if len(temp) == k and x == r and y == c:
            answer = temp
            return
        
        if abs(r-x) + abs(c-y) + len(temp) > k:
            return
        
        for letter, pos in dir.items():
            if 1 <= x + pos[0] <= n and 1 <= y + pos[1] <= m and len(answer) == 0:
                dfs(x + pos[0], y + pos[1], temp + letter)
    
    
    dist = abs(r-x) + abs(c-y)
    if dist > k or (k-dist) % 2 != 0:
        return "impossible"
    
    dfs(x, y, "")
    
    return answer
    
    