function solution(a, b, n) {
    let cnt = 0;
    while (n >= a) {
        let x = n;
        while (x%a!==0) {
            x--;
        }
        cnt += x/a * b;
        n = n - x + x/a * b;
    }
    return cnt;
}