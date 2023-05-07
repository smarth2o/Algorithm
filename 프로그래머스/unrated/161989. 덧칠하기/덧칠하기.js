function solution(n, m, section) {
    let answer = 1;
    let end = section[0] + m - 1;
    for (const s of section) {
        if (s > end) {
            answer++;
            end = s + m - 1;
        }
    }
    return answer;
}