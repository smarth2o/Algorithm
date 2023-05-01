function solution(s){
    let balance = 0;
    for (const p of s) {
        if (p==='\(') balance++;
        else balance--;
        if (balance < 0) return false;
    }
    return balance===0;
}