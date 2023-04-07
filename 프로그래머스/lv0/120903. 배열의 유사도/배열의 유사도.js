function solution(s1, s2) {
    let answer = 0;
    for (const a of s1) {
        if (s2.includes(a)) {
            answer++;
        }
    }
    return answer;
}