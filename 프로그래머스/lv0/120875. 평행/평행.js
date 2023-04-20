function solution(dots) {
    let [a, b, c, d] = dots;
    if (Math.abs((b[0]-a[0])/(b[1]-a[1])) === Math.abs((d[0]-c[0])/(d[1]-c[1]))) {
        return 1;
    } else if (Math.abs((c[0]-a[0])/(c[1]-a[1])) === Math.abs((d[0]-b[0])/(d[1]-b[1]))) {
        return 1;
    } else if (Math.abs((d[0]-a[0])/(d[1]-a[1])) === Math.abs((b[0]-c[0])/(b[1]-c[1]))) {
        return 1;
    }
    return 0;
}