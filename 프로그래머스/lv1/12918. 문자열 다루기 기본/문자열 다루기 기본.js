function solution(s) {
    if ((s.length===4 || s.length===6) && s.split('').filter(v => isNaN(v)).length === 0) {
        return true;
    }
    return false;
}