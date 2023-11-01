N = int(input())
nums = list(map(int, input().split()))

if N == 1 or (N == 2 and nums[0] != nums[1]):
    print('A')
elif N == 2 and nums[0] == nums[1]:
    print(nums[0])
else:
    if nums[1] == nums[0]:
        a = 1
        b = 0
    else:
        a = (nums[2]-nums[1]) / (nums[1]-nums[0])
        if int(a) != a:
            print('B')
            exit()
        b = nums[1] - nums[0] * a

    for i, num in enumerate(nums[:-1]):
        if num * a + b != nums[i+1]:
            print('B')
            exit()
    print(int(nums[-1] * a + b))