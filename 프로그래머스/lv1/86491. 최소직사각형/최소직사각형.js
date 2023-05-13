function solution(sizes) {
    
    let w = 0;
    let h = 0;
    
    sizes.forEach(v => {
        let [short, long] = [Math.min(...v), Math.max(...v)];
        if (short > w) w = short;
        if (long > h) h = long;
    });
    
    return w*h;
}