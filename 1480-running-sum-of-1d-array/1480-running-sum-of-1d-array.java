class Solution {
    public int[] runningSum(int[] nums)
 {
    for (int i = 1; i < nums.length; i++) {
//Add the previous running sum to the current element.
        nums[i] += nums[i - 1];
    }
    return nums;
}
 //Example:
        // nums = [1, 2, 3, 4]
        //
        // i = 1 → nums[1] = 2 + 1 = 3
        // i = 2 → nums[2] = 3 + 3 = 6
        // i = 3 → nums[3] = 4 + 6 = 10
    
    }
