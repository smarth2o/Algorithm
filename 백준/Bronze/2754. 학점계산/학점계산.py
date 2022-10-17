grade = input()
alpha = ['F', 'D', 'C', 'B', 'A']
score = alpha.index(grade[0])

if len(grade) > 1:
    if grade[1] == '+':
        score += 0.3
    elif grade[1] == '-':
        score -= 0.3
        
print(float(score))