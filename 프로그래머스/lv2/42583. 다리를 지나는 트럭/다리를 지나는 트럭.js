function solution(bridge_length, weight, truck_weights) {
    let bridge = Array(bridge_length).fill(0);
    let bridge_weight = 0;
    let time = 0;
    
    for (const truck of truck_weights) {
        while (bridge_weight - bridge[0] + truck > weight) {
            bridge_weight -= bridge.shift();
            bridge.push(0);
            time++;
        }
        bridge_weight -= bridge.shift();
        bridge.push(truck);
        bridge_weight += truck;
        time++;
    }
    
    return time + bridge_length;
}