function solution(age) {
    var planet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'];
    return Array.from(String(age), (str) => Number(str)).map(num => planet[num]).join("");
}