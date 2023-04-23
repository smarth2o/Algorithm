function solution(name) {
    let answer = 0;
    const alp = 'OPQRSTUVWXYZABCDEFGHIJKLMN';
    let move = name.length - 1;
    
    [...name].map((e, i) => {
        if (answer !== 'A')
        answer += Math.abs(alp.indexOf(e) - alp.indexOf('A'));
        
        let idx = i+1;
        while (idx < name.length && name[idx] === 'A') {
            idx++;
        }
        move = Math.min(move, i*2 + name.length - idx, i + 2 * (name.length - idx));
    })
    return answer + move;
}