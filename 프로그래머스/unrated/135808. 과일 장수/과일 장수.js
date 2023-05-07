function solution(k, m, score) {
    let answer = 0;
    const slicedScore = score.sort((a,b) => a-b).slice(score.length % m);
    for (let i = 0; i < slicedScore.length; i += m) {
        answer += slicedScore[i] * m;
    }
    return answer;
}