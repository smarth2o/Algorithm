N, M = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]
arr2 = [list(map(int, input().split())) for _ in range(N)]
for i in range(N):
    print(*list(map(sum, zip(arr[i], arr2[i]))))