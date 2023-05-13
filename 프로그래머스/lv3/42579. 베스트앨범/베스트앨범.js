function solution(genres, plays) {
    let songs = {};
    
    for (let genre of [...new Set(genres)]) {
        songs[genre] = [];
    }
    for (let i=0; i < genres.length; i++) {
        songs[genres[i]].push(plays[i]);
    }
    
    Object.values(songs).forEach(v => v.sort((a,b) => b-a));
    songs = Object.fromEntries(Object.entries(songs).sort(([, a], [, b]) => b.reduce((acc, cur) => acc+cur, 0) - a.reduce((acc, cur) => acc+cur, 0)));
    
    let answer = [];
    for (const [k, v] of Object.entries(songs)) {
        answer.push(plays.indexOf(v[0]));
        // 장르에 속한 곡이 하나라면, 하나의 곡만 선택
        if (plays.indexOf(v[1]) >= 0) {
            // 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록
            if (v[0]===v[1]) answer.push(plays.indexOf(v[1], answer.at(-1)+1));
            else answer.push(plays.indexOf(v[1]));
        }
    }
    return answer;
}