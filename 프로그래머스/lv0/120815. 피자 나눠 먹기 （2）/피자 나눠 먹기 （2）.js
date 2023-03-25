function solution(n) {
    if (n%2 !== 0) {
        n = n * 2;
    }
    if (n%3 !== 0) {
        n = n * 3;
    }
    return n / 6;
}