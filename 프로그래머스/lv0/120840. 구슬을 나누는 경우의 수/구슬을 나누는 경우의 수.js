function fact(num) {
    var num = BigInt(num);
    if (num === BigInt(1) || num === BigInt(0)) {
        return BigInt(1);
    }
    return num * fact(num - BigInt(1));
}
function solution(balls, share) {
    return fact(balls) / (fact(balls-share) * fact(share));
}