function solution(brown, yellow) {
    let [w, h] = [0, 0];
    
    for (let i=1; i <= yellow; i++) {
        if (yellow%i===0) {
            h = i;
            w = yellow/i;
            if (w*2 + h*2 + 4 === brown) break;
        }
    }
    
    return [w+2, h+2];
}