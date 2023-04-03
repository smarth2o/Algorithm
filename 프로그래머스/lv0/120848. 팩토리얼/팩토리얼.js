function solution(n) {
    var factorial = 1;
    for (var i = 1; i <= 10; i++) {
        factorial *= i;
        if (factorial > n) {
            return i-1;
        } 
    }
    return 10;
}