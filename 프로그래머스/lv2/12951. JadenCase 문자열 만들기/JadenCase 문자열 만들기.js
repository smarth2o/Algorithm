function solution(s) {
    return s.split(' ').map((v, i) => {
        if (v!=='') return v[0].toUpperCase() + v.substring(1).toLowerCase();
    }).join(' ');
}