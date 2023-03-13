function solution(numer1, denom1, numer2, denom2) {
    let lcm = Math.max(denom1, denom2);
    while (true) {
      if ((lcm % denom1 == 0) && (lcm % denom2 == 0)) {
        break;
      } lcm++;
    }
    let numer = numer1 * lcm/denom1 + numer2 * lcm/denom2;
    
    let gcd = Math.min(numer, lcm);
    
    while (true) {
        if ((numer % gcd == 0) && (lcm % gcd == 0)) {
            numer = numer / gcd;
            lcm = lcm / gcd;
            break;
        } gcd--;
    }
    
    return [numer,  lcm];
}