function solution(num, k) {
    let arr = Array.from(String(num), Number);
    return arr.includes(k) ? arr.indexOf(k)+1 : -1;
}