function solution(k, score) {
    let answer = [];
    
    let lowest = score[0];
    let honors = [];
    
    for (let i=0; i < k; i++) {
        honors.push(score[i]);
        if (score[i] < lowest) lowest = score[i];
        answer.push(lowest);
    }
    
    for (let i=k; i < score.length; i++) {
        if (score[i] > lowest) {
            honors.splice(honors.indexOf(lowest), 1);
            honors.push(score[i]);
            honors.sort((a,b) => a-b);
            lowest = honors[0];
        }
        answer.push(lowest);
    }
    return answer.slice(0, score.length);
}