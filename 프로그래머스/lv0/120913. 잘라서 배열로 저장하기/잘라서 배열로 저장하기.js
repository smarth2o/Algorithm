function solution(my_str, n) {
    let my_arr = [];
    for (let i=0; i <= my_str.length-1; i += n) {
        my_arr.push(my_str.slice(i, i+n));
    }
    return my_arr;
}