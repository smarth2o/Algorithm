def solution(n, costs):
    costs.sort(key = lambda x: x[2])
    island = set([costs[0][0]])
    answer = 0
    
    while len(island) < n:
        for cost in costs:
            # 두 섬 다 연결했으면 패스
            if cost[0] in island and cost[1] in island:
                continue
            # 한 섬만 연결되어 있으면 최소 비용으로 새로운 섬 연결하고 다시 처음부터 돌기
            if cost[0] in island or cost[1] in island:
                island.update([cost[0], cost[1]])
                answer += cost[2]
                break
    
    
    return answer