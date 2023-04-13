function solution(sides) {
    let short = Math.min(...sides);
    let long = Math.max(...sides);
    console.log(short, long);
    // 가장 긴 변일 경우 : long < result < long + short
    // 아닐 경우 : long - short < result <= long
    return (long+short) - (long-short) - 1;
}