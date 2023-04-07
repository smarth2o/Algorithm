function solution(my_string) {
    let arr = my_string.split(" ");
    let answer = 0;
    let num = "";
    let oper = "";
    for (let i = 0; i <= arr.length; i++) {
        if (arr[i] === '+' || arr[i] === '-' || i === arr.length) {
            if (oper[oper.length-1] === '-') {
                answer -= Number(num);
            } else {
                answer += Number(num);
            }
            num = "";
            oper += arr[i];
        } else {
            num += arr[i];
        }
    }
    return answer;
}