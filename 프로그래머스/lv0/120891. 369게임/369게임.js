function solution(order) {
    return Array.from(String(order), (v) => Number(v)).reduce((acc, cur) => acc + (cur % 3 === 0 && cur !== 0), 0);
}