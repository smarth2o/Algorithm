function solution(s) {
    return s.split(' ').map(arr => [...arr].map((v, i) => i%2===0 ? v.toUpperCase() : v.toLowerCase()).join('')).join(' ');
}