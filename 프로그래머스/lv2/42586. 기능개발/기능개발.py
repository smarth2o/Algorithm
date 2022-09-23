def solution(progresses, speeds):
    import math
    
    answer = []
    
    days = []
    for p, s in zip(progresses, speeds):
        days.append(math.ceil((100-p)/s))
        
    most = days[0]
    cnt = 0
    for day in days:
        if day > most:
            most = day
            answer.append(cnt)
            cnt = 1
        else:
            cnt += 1
    answer.append(cnt)
    
    return answer