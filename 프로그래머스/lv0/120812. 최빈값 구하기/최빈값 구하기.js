function solution(array) {
    var cnt = array.reduce( (nums, curr) => {
        if (curr in nums) {
            nums[curr]++;
        } else {
            nums[curr] = 1;
        }
        return nums;
    }, {});
    var mode = Object.keys(cnt).filter((key) => cnt[key] === Math.max(...Object.values(cnt)));
    return mode.length > 1 ? -1 : parseInt(mode[0]);
}