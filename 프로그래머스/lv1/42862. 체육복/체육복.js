function solution(n, lost, reserve) {
    
    let reserved = reserve.filter((v) => !lost.includes(v));
    lost = lost.filter((v) => !reserve.includes(v));
    
    lost.sort((a,b) => a-b);

    lost.forEach((v) => {
        if (reserved.includes(v-1)) {
            n++;
            reserved = reserved.filter((e) => e !== v-1);
        } else if (reserved.includes(v+1)) {
            n++;
            reserved = reserved.filter((e) => e !== v+1);
        }
    })
    
    return n - lost.length;
}