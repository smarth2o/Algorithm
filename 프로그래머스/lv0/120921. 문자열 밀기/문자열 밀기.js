function solution(A, B) {
    let cnt = 0;
    while (cnt <= A.length) {
        if (A === B) return cnt;
        A = A.slice(A.length-1) + A.slice(0, A.length-1);
        cnt++;
    }
    return -1;
}