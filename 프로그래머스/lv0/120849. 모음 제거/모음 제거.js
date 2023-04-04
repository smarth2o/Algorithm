function solution(my_string) {
    return my_string.split("").filter(x => (x !== "a" && x !== "e" && x !== "i" && x !== "o" && x !== "u")).join("");
}