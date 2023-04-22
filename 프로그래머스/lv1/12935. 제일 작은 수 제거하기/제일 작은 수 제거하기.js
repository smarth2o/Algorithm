function solution(arr) {
    if (arr.length===1) return [-1];
    arr.splice(arr.indexOf([...arr].sort((a,b)=>a-b)[0]), 1);
    return arr;
}