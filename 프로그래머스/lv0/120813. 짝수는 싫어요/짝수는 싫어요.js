function solution(n) {
    return [...new Array(n)].map((_, i) => i + 1).filter(i => i%2 === 1);
}