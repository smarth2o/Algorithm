function solution(emergency) {
    var sorted = [...emergency].sort((a, b) => b-a);
    var result = [];
    for (let patient of emergency) {
        result.push(sorted.indexOf(patient)+1);
    }
    return result;
}