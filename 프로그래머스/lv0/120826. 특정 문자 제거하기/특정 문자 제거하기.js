function solution(my_string, letter) {
    return [...my_string].filter(s => s !== letter).join("");
}