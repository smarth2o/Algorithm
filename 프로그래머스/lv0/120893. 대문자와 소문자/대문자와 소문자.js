function solution(my_string) {
    return my_string.split("").map(v => {
        if (v.toLowerCase() === v) {
            return v.toUpperCase();
        } else {
            return v.toLowerCase();
        }
    }).join("");
}