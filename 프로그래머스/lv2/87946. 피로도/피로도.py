from itertools import permutations

def solution(k, dungeons):
    # 케이스별로 탐험 가능한 던전 수 저장할 리스트
    total = []
    
    for i, case in enumerate(permutations(dungeons)):
        # 피로도 초기화
        fatigue = k
        # 탐험 가능한 던전 수 초기화
        cnt = 0

        for dungeon in case:
            # 최소 필요 피로도
            minimum = dungeon[0]
            # 소모 피로도
            cost = dungeon[1]
            
            if fatigue >= minimum:
                fatigue -= cost
                cnt += 1
            else:
                break
            
        total.append(cnt)
        
    return max(total)
    