function fact(num) {
    if (num === 1 || num === 0) {
        return 1;
    }
    return num * fact(num - 1);
}
function solution(balls, share) {
    return Math.round(fact(balls) / (fact(balls-share) * fact(share)));
}