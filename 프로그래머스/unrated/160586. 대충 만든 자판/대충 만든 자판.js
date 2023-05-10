function solution(keymap, targets) {
    // 입력하려는 문자들
    // targets에서 중복 제거해서 alphabets에 저장
    let alphabets = [];
    for (const target of targets) {
        target.split('').map(v => alphabets.push(v));
    }
    alphabets = [...new Set(alphabets)];
    
    // 문자들마다 키를 눌러야 되는 횟수
    // cnt에 배열로 횟수 담아 최소 횟수 count에 저장
    let count = {};
    for (const alphabet of alphabets) {
        let cnt = keymap.map(v => v.indexOf(alphabet) + 1).filter(v => v !== 0);
        if (cnt.length !== 0) count[alphabet] = Math.min(...cnt);
    }
    
    // 문자열마다 계산
    let answer = [];
    for (const target of targets) {
        if (target.split('').every(v => v in count)) {
            let press = target.split('').reduce((acc, cur) => acc + count[cur], 0);
            answer.push(press);
        }
        else {
            answer.push(-1);
        }
    }
    
    return answer;
}