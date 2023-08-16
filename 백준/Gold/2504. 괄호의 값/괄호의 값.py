arr = input()
stack = []
temp = 1
answer = 0

for i in range(len(arr)):
    if arr[i] == "(":
        temp *= 2
        stack.append(arr[i])
    elif arr[i] == "[":
        temp *= 3
        stack.append(arr[i])
    elif arr[i] == ")":
        if not stack or stack[-1] == "[":
            answer = 0
            break
        if arr[i-1] == "(":
            answer += temp
        temp //= 2
        stack.pop()
    else:
        if not stack or stack[-1] == "(":
            answer = 0
            break
        if arr[i-1] == "[":
            answer += temp
        temp //= 3
        stack.pop()

if stack:
    print(0)
else:
    print(answer)