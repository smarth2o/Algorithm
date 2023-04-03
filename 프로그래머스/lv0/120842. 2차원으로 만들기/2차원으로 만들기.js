function solution(num_list, n) {
    var result = [];
    for (var i = 0; i < num_list.length; i++) {
        if (i % n === 0) {
            result.push([]);
        }
        result[Math.floor(i/n)].push(num_list[i]);
    }
    return result;
}