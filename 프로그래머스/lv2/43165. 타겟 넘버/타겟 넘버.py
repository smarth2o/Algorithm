def solution(numbers, target):
    from itertools import product
    ans = 0
    for operations in product(['-', '+'], repeat=len(numbers)):
        expression = 0
        for op, num in zip(operations, numbers):
            if op == '+':
                expression += num
            else:
                expression -= num
        if expression == target:
            ans += 1
    return ans
        