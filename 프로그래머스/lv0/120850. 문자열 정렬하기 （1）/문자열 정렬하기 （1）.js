function solution(my_string) {
    return my_string.split("").filter((v) => "0123456789".includes(v)).map(v => Number(v)).sort();
}