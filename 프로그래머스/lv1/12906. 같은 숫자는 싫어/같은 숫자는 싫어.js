function solution(arr)
{
    let answer = [];
    arr.forEach(x => {
        if (answer[answer.length-1]!==x) answer.push(x); 
    })
    return answer;
}