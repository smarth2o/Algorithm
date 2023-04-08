function solution(quiz) {
    return quiz.map((v) => {
        let [prob, answ] = v.split('=');
        return eval(prob) === Number(answ) ? 'O' : 'X';
    });
}