from collections import deque
def solution(people, limit):
    people.sort()
    people = deque(people)
    result = 0
    while len(people) > 1:
        if people[0] + people[-1] <= limit:
            people.popleft()
        people.pop()
        result += 1
    return result + len(people)