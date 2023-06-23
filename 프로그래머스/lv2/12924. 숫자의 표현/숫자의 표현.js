function solution(n) {
    let answer = 1;
    for (let i=2; i < Math.ceil(n/2)+1; i++) {
        if (i%2===0) {
            if (Math.floor(n/i)+0.5===n/i && Math.ceil(n/i)-i/2 > 0) {
                answer++;
            }
        }
        else {
            if (n%i===0 && n/i-Math.floor(i/2) > 0) {
                answer++;
            } 
        }
    }
    return answer;
}