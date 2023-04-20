function solution(num, total) {
    let a = num%2!==0 ? total/num - (num-1)/2 : Math.floor(total/(num/2) / 2) - (num/2 - 1);
    console.log(a);
    return Array(num).fill(a).map((v, i) => v+i);
}