from collections import deque

N, M = map(int, input().split())
truth = list(map(int, input().split()))[1:]
parties = [[] for _ in range(M)]
people = [[] for _ in range(N+1)]

for i in range(M):
    tmp = list(map(int, input().split()))[1:]
    for t in tmp:
        parties[i].append(t)
        people[t].append(i)

queue = deque()
met = [False for _ in range(N+1)]
visited = [False for _ in range(M)]

for t in truth:
    met[t] = True
    for party in people[t]:
        if not visited[party]:
            visited[party] = True
            queue.append(party)

while queue:
    p = queue.pop()
    for person in parties[p]:
        if not met[person]:
            met[person] = True
            for party in people[person]:
                if not visited[party]:
                    visited[party] = True
                    queue.append(party)

print(M-sum(visited))