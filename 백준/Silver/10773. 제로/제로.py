nums = []
for _ in range(int(input())):
    x = int(input())
    if x == 0:
        nums.pop()
    else:
        nums.append(x)
print(sum(nums))