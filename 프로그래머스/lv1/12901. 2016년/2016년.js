function solution(a, b) {
    const day = ['THU', 'FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED'];
    const month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    if (a!==1) {
        for (let i=1; i < a; i++) {
            b += month[i-1];
        }
    }
    return day[b%7];
}