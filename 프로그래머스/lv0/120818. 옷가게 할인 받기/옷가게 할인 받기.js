function solution(price) {
    if (price >= 500000) {
        price = price * 0.8;
    } else if (price >= 300000) {
        price = price * 0.9;
    } else if (price >= 100000) {
        price = price * 0.95;
    }
    return Math.floor(price);
}