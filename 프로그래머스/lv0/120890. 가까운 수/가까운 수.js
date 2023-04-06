function solution(array, n) {
    if (array.includes(n)) {
        return n;
    }
    
    const closest = Math.min(...array.map((v) => Math.abs(v-n)));
    
    if (array.includes(n - closest)) {
        return n - closest;
    } else {
        return n + closest;
    }
}