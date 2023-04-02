function solution(rsp) {
    var rockpaperscissor = { 2:0, 0:5, 5:2 };
    return [...rsp].reduce((prev, curr) => prev + rockpaperscissor[curr], '');
}