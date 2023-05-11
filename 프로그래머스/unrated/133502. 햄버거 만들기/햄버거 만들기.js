function solution(ingredient) {
    // 하나씩 넣고 4개 이상이 되면 확인하기
    let answer = 0;
    
    let stack = [];
    for (const i of ingredient) {
        stack.push(i);
        if (stack.slice(-4).join('') === '1231') {
            answer++;
            stack.splice(-4);
        }
    }
    
    return answer;
}