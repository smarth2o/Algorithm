function solution(my_string) {
    return my_string.match(/\d/g).map((n) => Number(n)).reduce((acc, v) => acc + v);
}