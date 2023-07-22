N = int(input())

five = 0
three = 0

five += N//5
N = N%5

while N%3 != 0:
    if five == 0:
        break
    five -= 1
    N += 5

if N%3 == 0:
    three += N//3
    print(five+three)
else:
    print(-1)