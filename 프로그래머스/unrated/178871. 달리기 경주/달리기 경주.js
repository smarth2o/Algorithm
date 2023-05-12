function solution(players, callings) {
    let pos = new Map();
    players.forEach((v, i) => pos.set(v, i));
    
    for (const calling of callings) {
        let idx = pos.get(calling);
        let before = players[idx - 1];
        [players[idx-1], players[idx]] = [players[idx], players[idx-1]]
        
        pos.set(calling, pos.get(calling) - 1);
        pos.set(before, pos.get(before) + 1);
    }

    return players;
}