function solution(i, j, k) {
    return Array(j-i+1).fill().map((_, idx) => idx+i).reduce((acc, cur) => String(cur).split('').filter((v) => v===String(k)).length + acc, 0);
}