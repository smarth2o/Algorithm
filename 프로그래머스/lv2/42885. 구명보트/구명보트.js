function solution(people, limit) {
    let answer = 0;
    people.sort((a,b) => a-b);
    while (people.length > 1) {
        if (people.pop() + people[0] <= limit) {
            people.shift();
        }
        answer++;
    }
    return answer + people.length;
}