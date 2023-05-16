while True:
    triangle = list(map(int, input().split()))
    triangle.sort()
    if triangle[-1] == 0:
        break
    if triangle[-1]**2 == triangle[0]**2 + triangle[1]**2:
        print('right')
    else:
        print('wrong')