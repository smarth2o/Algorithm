function solution(num_list) {
    reverse = [];
    for (var i = num_list.length-1; i >= 0; i--) {
        reverse.push(num_list[i]);
    }
    return reverse;
}