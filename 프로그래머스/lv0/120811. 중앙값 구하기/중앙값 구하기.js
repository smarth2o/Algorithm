function solution(array) {
    array.sort( function compareNumbers(a, b) {
        return a-b;
    })
    return array[Math.ceil(array.length / 2)-1];
}