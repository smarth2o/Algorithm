function solution(s) {
    let answer = [s[0].toUpperCase()];
    for (let i=1; i < s.length; i++) {
        if (answer[answer.length-1] === " ") {
            answer.push(s[i].toUpperCase());
        } else {
            answer.push(s[i].toLowerCase());
        }
    }
    return answer.join('');
}