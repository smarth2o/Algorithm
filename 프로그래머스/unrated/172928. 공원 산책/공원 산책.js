function solution(park, routes) {
    
    let x = 0;
    let y = 0;
    
    for (let i=0; i < park.length; i++) {
        for (let j=0; j < park[0].length; j++) {
            if (park[i][j] === 'S') {
                x = i;
                y = j;
                break;
            }
        }
    }
    
    for (const route of routes) {
        let [dir, dis] = route.split(' ');
        dis = Number(dis);
        let free = true;
        
        if (dir === 'N' && x - dis >= 0) {
            for (let i=1; i <= dis; i++) {
                if (park[x-i][y] === 'X') {
                    free = false;
                    break;
                }
            }
            if (free) x -= dis;
        } else if (dir === 'S' && x + dis < park.length) {
            for (let i=1; i <= dis; i++) {
                if (park[x+i][y] === 'X') {
                    free = false;
                    break;
                }
            }
            if (free) x += dis;
        } else if (dir === 'W' && y - dis >= 0) {
            for (let j=1; j <= dis; j++) {
                if (park[x][y-j] === 'X') {
                    free = false;
                    break;
                }
            }
            if (free) y -= dis;
        } else if (dir === 'E' && y + dis < park[0].length) {
            for (let j=1; j <= dis; j++) {
                if (park[x][y+j] === 'X') {
                    free = false;
                    break;
                }
            }
            if (free) y += dis;
        }
        
    }
    return [x, y];
}