function solution(n) {
    var answer = 0;
    if (n <= 3) return 0;
    for (var i = 4; i <= n; i++) {
        if ((i % 2 == 0 && i !== 2) || (i % 3 == 0 && i !== 3) || (i % 5 == 0 && i !== 5) || (i % 7 == 0 && i !== 7)) answer++;
    }
    return answer;
}