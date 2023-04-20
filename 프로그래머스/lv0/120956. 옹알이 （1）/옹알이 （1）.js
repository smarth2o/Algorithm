function solution(babbling) {
    babbling = babbling.map(str => str.replaceAll("aya", " "));
    babbling = babbling.map(str => str.replaceAll("ye", " "));
    babbling = babbling.map(str => str.replaceAll("woo", " "));
    babbling = babbling.map(str => str.replaceAll("ma", " "));
    babbling = babbling.map(str => str.replaceAll(" ", ""));
    return babbling.filter(str => str === "").length;
}