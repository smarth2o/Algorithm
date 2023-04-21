function solution(n) {
    if (n===1) return 4;
    for (let i=2; i<n/2; i++) {
        if (i*i === n) {
            return (i+1)*(i+1);
        }
    }
    return -1;
}