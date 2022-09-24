def solution(s):
    
    x = 0
    for p in s:
        x = x+1 if p == '(' else x-1
        
        if x<0:
            break

    return x==0