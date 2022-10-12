import sys
submit = [int(sys.stdin.readline().rstrip()) for _ in range(28)]
submit.sort()
i = 1
for num in submit:
    if num != i:
        print(i)
        i += 1
    i += 1
if i == 29:
    print(29)
    i += 1
if i == 30:
    print(30)