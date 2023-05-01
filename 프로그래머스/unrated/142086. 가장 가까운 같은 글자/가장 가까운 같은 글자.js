function solution(s) {
    let compare = [];
    let answer = [];
    for (const letter of s.split('')) {
        let pos = compare.findIndex(x => x===letter);
        answer.push(pos < 0 ? pos : pos+1);
        compare.unshift(letter);
    }
    return answer;
}