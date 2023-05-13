function solution(citations) {
    for (let num = citations.length; num >= 0; num--) {
        if (citations.filter(v => v >= num).length >= num) {
            return num;
        }
    }
}