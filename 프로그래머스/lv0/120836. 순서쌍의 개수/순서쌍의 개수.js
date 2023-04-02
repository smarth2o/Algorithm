function solution(n) {
    return Array(n).fill().map((_, i) => i+1).filter(v => n%v == 0).length;
}