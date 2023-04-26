function solution(s, n) {
    return s.split('').map((v, i) => {
        if (v!==' ') {
            if (s.charCodeAt(i) <= 90 && s.charCodeAt(i) + n > 90) {
                return String.fromCharCode(s.charCodeAt(i) + n - 26);
            } else if (s.charCodeAt(i) >= 97 && s.charCodeAt(i) + n > 122) {
                return String.fromCharCode(s.charCodeAt(i) + n - 26);
            } else {
                return String.fromCharCode(s.charCodeAt(i) + n);
            }
        } else {
            return ' ';
        }
    }).join('');
}