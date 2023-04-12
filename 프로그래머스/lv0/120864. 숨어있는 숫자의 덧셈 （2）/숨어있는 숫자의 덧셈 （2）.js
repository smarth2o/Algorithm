function solution(my_string) {
    return my_string.split(/\D/).filter(v => parseInt(v)).reduce((acc, cur) => parseInt(cur) + acc, 0);
}