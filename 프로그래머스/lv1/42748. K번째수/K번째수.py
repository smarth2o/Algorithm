def solution(array, commands):
    answer = []
    for command in commands:
        a = sorted(array[command[0]-1:command[1]])
        answer.append(a[command[2]-1])
    
    return answer