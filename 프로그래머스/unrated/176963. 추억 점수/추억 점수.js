function solution(name, yearning, photo) {
    let answer = [];
    for (const pic of photo) {
        let cnt = 0;
        for (const p of pic) {
            if (name.includes(p)) {
                cnt += yearning[name.findIndex(x => x===p)];
            }
        }
        answer.push(cnt);
    }
    return answer;
}