function solution(spell, dic) {
    for (const word of dic) {
        let included = spell.filter(letter => word.includes(letter) && (word.indexOf(letter) === word.lastIndexOf(letter)));
        if (spell.length === included.length) {
            return 1;
        }
    }
    return 2;
}