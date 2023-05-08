function solution(X, Y) {
    let answer = "";
    X = X.split('').sort().reverse();
    Y = Y.split('').sort().reverse();
    let i = 0;
    let j = 0;
    while (i < X.length && j < Y.length) {
        if (X[i] < Y[j]) j++;
        else if (X[i] > Y[j]) i++;
        else {
            answer += X[i];
            i++;
            j++;
        }
    }
    return answer.length === 0 ? "-1" : answer.startsWith(0) ? "0" : answer;
}