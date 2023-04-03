function solution(numbers, k) {
    if ((k*2 - 1) % numbers.length) {
        return numbers[(k*2 - 1) % numbers.length - 1];
    }
    return numbers[numbers.length-1];
}