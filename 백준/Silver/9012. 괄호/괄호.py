x = 0
for _ in range(int(input())):
    for p in input():
        if p == '(':
            x += 1
        else:
            x -= 1
            
        if x < 0:
            break
     
    print('YES') if x == 0 else print('NO')
    x = 0