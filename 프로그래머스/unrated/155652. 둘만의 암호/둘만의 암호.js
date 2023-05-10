function solution(s, skip, index) {
    skip = skip.split('').map(v => v.charCodeAt(0));
    console.log(skip);
    s = s.split('').map((v, i) => {
        let change = s.charCodeAt(i);
        for (let i=0; i < index; i++) {
            change++;
            if (change > 122) change -= 26;
            while (skip.includes(change)) {
                change++;
                if (change > 122) change -= 26;
            }
        }
        return change;
    })
    console.log(s);
    return String.fromCharCode(...s);
}