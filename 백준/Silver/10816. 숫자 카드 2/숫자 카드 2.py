N = int(input())
arr = {}
for i in list(input().split()):
    if i in arr:
        arr[i] += 1
    else:
        arr[i] = 1

M = int(input())
for num in list(input().split()):
    if num in arr:
        print(arr[num], end=' ')
    else:
        print(0, end=' ')