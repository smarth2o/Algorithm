function solution(babbling) {
    // 중복 중에서 붙어있는 중복만 안 됨
    babbling = babbling.map(s => s.replaceAll("aya", "1"));
    babbling = babbling.map(s => s.replaceAll("ye", "2"));
    babbling = babbling.map(s => s.replaceAll("woo", "3"));
    babbling = babbling.map(s => s.replaceAll("ma", "4"));
    console.log(babbling);
    return babbling.filter(b => Math.round(b) === parseInt(b) && !b.includes("11") && !b.includes("22") && !b.includes("33") && !b.includes("44")).length;
}