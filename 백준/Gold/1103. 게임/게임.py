import sys
sys.setrecursionlimit(10**6)

N, M = map(int, input().split())
board = [list(input()) for _ in range(N)]

dp = [[0 for _ in range(M)] for _ in range(N)]
visited = [[False for _ in range(M)] for _ in range(N)]
dir = [[0, 1], [1, 0], [0, -1], [-1, 0]]
answer = -1


def dfs(r, c, cnt):
    global answer

    x = int(board[r][c])

    for dr, dc in dir:
        nr = r + dr * x
        nc = c + dc * x
        if nr < 0 or nr >= N or nc < 0 or nc >= M or board[nr][nc] == 'H':
            if cnt + 1 >= answer:
                answer = cnt + 1
            continue

        if visited[nr][nc]:
            print(-1)
            exit()

        if dp[nr][nc] >= cnt + 1:
            continue

        dp[nr][nc] = cnt+1
        visited[nr][nc] = True
        dfs(nr, nc, cnt+1)
        visited[nr][nc] = False


dfs(0, 0, 0)
print(answer)