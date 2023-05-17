for i in range(int(input())):
    num, string = input().split()
    for s in string:
        print(s*int(num), end='')
    print()