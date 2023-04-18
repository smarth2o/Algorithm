function solution(a, b) {
    
    while (b%2===0 || b%5===0) {
        if (b%2===0) b/=2;
        if (b%5===0) b/=5;
    }
    
    for (let i = a; i > 0; i--) {
        if (a % i === 0 && b % i === 0) {
            b /= i;
            a /= i;
        }
    };
    
    return b > 1 ? 2 : 1;
}