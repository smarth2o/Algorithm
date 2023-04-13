function solution(bin1, bin2) {
    bin1 = bin1.split('');
    bin2 = bin2.split('');
    let result = "";
    let up = 0;
    while (bin1.length + bin2.length > 0) {
        let add = up;
        let b = [Number(bin1.pop()), Number(bin2.pop())];
        if (b[0]) add += b[0];
        if (b[1]) add += b[1];
        result = String(add%2) + result;
        up = Math.floor(add/2);
    }
    return up ? '1' + result : result;
}