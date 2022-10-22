alp = [-1]*26
ori = input()
for s in set(ori):
    alp[ord(s)-97] = ori.index(s)
for a in alp:
    print(a, end=" ")