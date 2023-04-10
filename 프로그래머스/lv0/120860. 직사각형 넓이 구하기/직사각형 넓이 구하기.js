function solution(dots) {
    let x = [];
    let y = [];
    dots.map(v => {
        x.push(v[0]);
        y.push(v[1]);
    })
    return (Math.max(...x) - Math.min(...x))*(Math.max(...y) - Math.min(...y));
}