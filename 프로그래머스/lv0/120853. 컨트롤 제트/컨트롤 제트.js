function solution(s) {
    var nums = s.split(" ");
    while (nums.includes("Z")) {
        nums.splice(nums.indexOf("Z")-1, 2);
    }
    return nums.reduce((acc, cur) => acc + Number(cur), 0);
}