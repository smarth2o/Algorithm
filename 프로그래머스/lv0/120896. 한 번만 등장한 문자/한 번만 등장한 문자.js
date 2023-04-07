function solution(s) {
    let cnt = s.split("").sort().reduce((acc, cur) => {
        if (cur in acc) {
            acc[cur]++;
        } else {
            acc[cur] = 1;
        }
        return acc;
    }, {});
    let answer = "";
    for (const key in cnt) {
        if (cnt[key] === 1) {
            answer += key;
        }
    }
    return answer;
}