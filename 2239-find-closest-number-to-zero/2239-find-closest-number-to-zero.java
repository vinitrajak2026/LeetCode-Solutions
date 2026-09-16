class Solution {
    public int findClosestNumber(int[] nums) {
    int ans = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (Math.abs(nums[i]) < Math.abs(ans)) {
 // Math.abs() number ka absolute value deta hai   -5 → 5
 // Agar current number ki distance from 0 answer ki distance se kam hai, toh current number ko answer bana do
        ans = nums[i];

        } 
        else if (Math.abs(nums[i]) == Math.abs(ans) && nums[i] > 0) {
            //agr dono same dis dur hai like -4 and 4 ko +4 lo ans 
            ans = nums[i];
        }
    }
    return ans;
  }

}