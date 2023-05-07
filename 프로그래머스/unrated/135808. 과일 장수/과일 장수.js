function solution(k, m, score) {
    if (m > score.length) return 0;
    
    score.sort((a,b) => a-b);
    if (score.length % m !== 0) {
        score = score.slice(score.length % m);
    }
    
    let answer = 0;
    for (let i = 0; i < score.length; i += m) {
        answer += score[i] * m;
    }
    return answer;
}