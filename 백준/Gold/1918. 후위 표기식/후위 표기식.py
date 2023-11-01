equation = list(input())
ops = {'+': 0, '-': 0, '*': 1, '/': 1, '(': 2, ')': 2}

answer = []
stk = []
for e in equation:
    if e not in ops:
        answer.append(e)
    elif e == ')':
        while stk[-1] != '(':
            answer.append(stk.pop())
        stk.pop()
    else:
        while stk and ops[stk[-1]] >= ops[e] and stk[-1] != '(':
            answer.append(stk.pop())
        stk.append(e)

while stk:
    answer.append(stk.pop())

print(''.join(answer))