N = int(input())
board = [0]*N
answer = 0


def check(x):
    for i in range(x):
        if board[x] == board[i] or abs(board[i]-board[x]) == abs(x-i):
            return False
    return True


def dfs(x):
    global answer
    if x == N:
        answer += 1
        return
    for i in range(N):
        board[x] = i
        if check(x):
            dfs(x+1)


dfs(0)
print(answer)