function solution(score) {
    score = score.map(v => (v[0] + v[1]) / 2 );
    return score.map(v => {
        return score.filter(x => v < x).length + 1;
    });
}