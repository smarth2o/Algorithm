from itertools import product
def solution(word):
    vowels = []
    for vowel in product('AEIOU ', repeat=5):
        vowels.append("".join(vowel).replace(" ", ""))
    vowels = sorted(list(set(vowels)))
    return vowels.index(word)