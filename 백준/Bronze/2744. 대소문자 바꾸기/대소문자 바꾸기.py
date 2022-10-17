word = list(input())
new_word = ""
for w in word:
    new_word += w.upper() if w.islower() else w.lower()
print(new_word)