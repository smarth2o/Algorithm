function solution(number, k) {
    let arr = [];
    
    for (let i = 0; i < number.length; i++) {
        while (k>0 && arr[arr.length-1] < number[i]) {
            arr.pop();
            k--;
        }
        arr.push(number[i]);
    }
    arr.splice(number.length-k);
    return arr.join('');
}