function solution(before, after) {
    let bef = before.split('').sort().toString();
    let aft = after.split('').sort().toString();
    return bef == aft ? 1 : 0;
}