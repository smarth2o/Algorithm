from itertools import combinations

def solution(orders, course):
    cnt = dict()
    for order in orders:
        for c in course:
            if len(order) >= c:
                for x in list(combinations(list(order), c)):
                    x = ''.join(sorted(x))
                    if x in cnt:
                        cnt[x] += 1
                    else:
                        cnt[x] = 1
    
    answer = []
    cnt = sorted(cnt.items(), key=lambda x: (len(x[0]), x[1]), reverse=True)
    max_cnt = cnt[0]
    for k, v in cnt:
        if v < 2 or (len(k) == len(max_cnt[0]) and v < max_cnt[1]):
            continue
        elif len(k) == len(max_cnt[0]) and v == max_cnt[1]:
            answer.append(k)
        else:
            answer.append(k)
            max_cnt = [k, v]
        
    return sorted(answer)
        
    
        