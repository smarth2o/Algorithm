function solution(n) {
    return Array.from(String(n), Number).reduce((acc, cur) => acc + cur, 0);
}