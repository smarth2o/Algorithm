function solution(n, m) {
    let answer = [];
    for (let i = Math.min(n, m); i > 0; i--) {
        if (n%i===0 && m%i===0) {
            answer.push(i);
            break;
        }
    }
    if (answer[0]===1) {
        answer.push(n*m);
    } else {
        let j = Math.max(n, m);
        while (true) {
            if (j%m===0 && j%n===0) {
                answer.push(j);
                break;
            }
            j++;
        }
    }
    return answer;
}