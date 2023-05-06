function solution(cards1, cards2, goal) {
    // 둘 중 아무거나, 가장 앞에서부터
    // 카드 남아도 통과
    for (const v of goal) {
        if (v===cards1[0]) cards1.shift();
        else if (v===cards2[0]) cards2.shift();
        else return "No";
    }
    return "Yes";
}