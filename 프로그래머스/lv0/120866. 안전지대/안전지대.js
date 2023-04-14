function solution(board) {
    let answer = Array.from(Array(board.length), () => new Array(board.length).fill(1));
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board.length; j++) {
            if (board[i][j] === 1) {
                for (let x = i-1; x <= i+1; x++) {
                    for (let y = j-1; y <= j+1; y++) {
                        if (x >= 0 && y >= 0 && x < board.length && y < board.length) answer[x][y] = 0;
                    }
                }
            }
        }
    }
    return answer.reduce((acc, cur) => acc + cur.reduce((a, c) => c + a, 0), 0);
}