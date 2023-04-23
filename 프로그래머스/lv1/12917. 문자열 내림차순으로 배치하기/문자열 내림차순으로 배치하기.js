function solution(s) {
    return s.split('').filter(v => v === v.toLowerCase()).sort().reverse().join('') + s.split('').filter(v => v === v.toUpperCase()).sort().reverse().join('');
}