function solution(clothes) {
    let type = new Map();
    
    for (const [name, cloth] of clothes) {
        type.set(cloth, (type.get(cloth) || 0) + 1);
    }
    
    let combo = 1;
    for (const [k, v] of type) {
        combo *= v+1;
    }
    return combo-1;
}