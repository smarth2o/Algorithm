T = int(input())
for tc in range(1, T+1):
    N = int(input())
    names = set([input() for _ in range(N)])
    names = sorted(names, key=lambda x: (len(x), x))
    print("#"+str(tc))
    for name in names:
        print(name)