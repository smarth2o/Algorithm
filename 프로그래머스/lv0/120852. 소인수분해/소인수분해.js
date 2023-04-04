function solution(n) {
    var result = [];
    for (var i=2; i <=n; i++) {
        if (n%i === 0) {
            if (result.length === 0) {
                result.push(i);
            } else if (result.filter((v) => i%v === 0).length === 0) {
                result.push(i);
            }
        }
    }
    return result;
}