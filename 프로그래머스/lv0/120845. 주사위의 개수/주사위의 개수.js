function solution(box, n) {
    return box.reduce((prev, curr) => prev * parseInt(curr/n), 1);
}