function solution(keyinput, board) {
    let pos = [0,0];
    let limit = [Math.floor((board[0]-1)/2), Math.floor((board[1]-1)/2)];
    console.log(limit);
    
    for (let input of keyinput) {
        if (input === "right" && pos[0] < limit[0]) {
            pos[0]++;
        } else if (input === "left" && pos[0] > -limit[0]) {
            pos[0]--;
        } else if (input === "up" && pos[1] < limit[1]) {
            pos[1]++;
        } else if (input === "down" && pos[1] > -limit[1]) {
            pos[1]--;
        }
    }
    return pos;
}