function solution(age) {
    var planet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'];
    return Array.from(age.toString()).map(num => planet[num]).join("");
}