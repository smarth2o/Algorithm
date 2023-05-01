function solution(progresses, speeds) {
    let answer = [];
    progresses = progresses.map((v, i) => Math.ceil((100 - v)/speeds[i]));
    
    while (progresses.length > 0) {
        let cnt = 1;
        let x = progresses.shift();
        while (progresses[0] <= x) {
            progresses.shift();
            cnt++;
        }
        answer.push(cnt);
    }
    return answer;
}