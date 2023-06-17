function solution(s) {
    let nums = s.split(' ').map(v => parseInt(v));
    return [Math.min(...nums), Math.max(...nums)].join(' ');
}