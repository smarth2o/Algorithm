function solution(answers) {
    let one = [1, 2, 3, 4, 5];
    let two = [2, 1, 2, 3, 2, 4, 2, 5];
    let three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    
    let cnt = [0, 0, 0];
    for (let i=0; i < answers.length; i++) {
        if (answers[i] === one[i%5]) cnt[0]++;
        if (answers[i] === two[i%8]) cnt[1]++;
        if (answers[i] === three[i%10]) cnt[2]++;
    }
    
    let highest = Math.max(...cnt);
    return cnt.reduce((acc, cur, idx) => {
        if (cur === highest) acc.push(idx+1);
        return acc;
    }, [])
}