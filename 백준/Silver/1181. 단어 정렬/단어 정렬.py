words = []
for i in range(int(input())):
    word = input()
    if word not in words:
        words.append(word)
words.sort(key=lambda x: (len(x), x))
for word in words:
    print(word)