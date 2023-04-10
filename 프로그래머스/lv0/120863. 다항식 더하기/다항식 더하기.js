function solution(polynomial) {
    let x = 0;
    let num = 0;
    for (let str of polynomial.split(' + ')) {
        if (str.endsWith('x') && str === 'x') {
            x += 1;
        }
        else if (str.endsWith('x')) {
            x += parseInt(str);
        } else {
            num += parseInt(str);
        }
    }
    
    if (x===1 && x*num > 0) {
        return 'x + ' + num;
    } else if (x*num > 0) {
        return [x, num].join('x + ');
    } if (x===1) {
        return 'x';
    } else if (x > 0) {
        return x+'x';
    } else {
        return String(num);
    }
}