function solution(lines) {
    
    let [a, b, c] = lines;
    
    let start = [a[0], b[0], c[0]].sort((a, b) => a-b)[1];
    let end = [a[1], b[1], c[1]].sort((a, b) => a-b)[1];
    
    let cnt = 0;
    
    for (let i = start; i < end; i++) {
        if (a[0] <= i && b[0] <= i && i < a[1] && i < b[1]) {
            cnt++;
        } else if (c[0] <= i && b[0] <= i && i < c[1] && i < b[1]) {
            cnt++;
        } else if (a[0] <= i && c[0] <= i && i < a[1] && i < c[1]) {
            cnt++;
        }
    }
    return cnt;
}