function solution(priorities, location) {
    let arr = priorities.map((priority, index) => {
        return {priority, index};
    });
    
    let order = 0;
    while (arr.length > 0) {
        let process = arr.shift();
        if (arr.some(e => e.priority > process.priority)) {
            arr.push(process);
        } else {
            order++;
            if (process.index === location) break;;
        }
    }
    return order;
}