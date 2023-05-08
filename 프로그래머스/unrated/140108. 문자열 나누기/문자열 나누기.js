function solution(s) {
    s = s.split('');
    let answer = 0;
    
    let first = s[0];
    let cnt = 0;
    for (let i=0; i < s.length; i++) {
        if (s[i] === first) cnt++;
        else cnt--;
        if (cnt === 0) {
            answer++;
            first = s[i+1];
        }
    }
    
    if (answer < 1 || cnt > 0) answer++;
    return answer;
}