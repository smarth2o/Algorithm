n = int(input())
seats = [[0 for j in range(n)] for i in range(n)]

dirX = [0, 1, 0, -1]
dirY = [1, 0, -1, 0]

students = []
friends = []

for _ in range(n**2):
    info = list(map(int, input().split()))
    student = info[0]
    friends.append(info[1:])
    likes = dict()
    for i in range(n):
        for j in range(n):
            if seats[i][j] != 0:
                continue
            like_cnt = 0
            empty_cnt = 0
            for k in range(4):
                x = i+dirX[k]
                y = j+dirY[k]
                if x < 0 or x >= n or y < 0 or y >= n:
                    continue
                if seats[x][y] in friends[-1]:
                    like_cnt += 1
                elif seats[x][y] == 0:
                    empty_cnt += 1
            likes[(i, j)] = [like_cnt, empty_cnt]

    likes = sorted(likes.items(), key=lambda kv: (kv[1][0], kv[1][1]), reverse=True)
    [r, c] = likes[0][0]
    seats[r][c] = student
    students.append([r, c])

answer = 0
for i in range(n**2):
    satisfy = 0
    [X, Y] = students[i]
    for k in range(4):
        x = X + dirX[k]
        y = Y + dirY[k]
        if x < 0 or x >= n or y < 0 or y >= n:
            continue
        if seats[x][y] in friends[i]:
            satisfy += 1
    answer += 0 if satisfy == 0 else 10**(satisfy-1)

print(answer)