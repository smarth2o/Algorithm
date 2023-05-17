word = input().upper()
letters = dict()
for letter in word:
    if letter in letters:
        letters[letter] += 1
    else:
        letters[letter] = 1
        
most = sorted(letters.values(), reverse=True)[0]
answer = []
for k, v in letters.items():
    if v == most:
        answer += k
if (len(answer) > 1):
    print('?')
else:
    print(answer[0])