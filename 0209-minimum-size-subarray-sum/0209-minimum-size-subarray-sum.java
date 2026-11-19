class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int l=0;
       int tot=0;
       int min=Integer.MAX_VALUE;
       for(int h=0;h<nums.length;h++)
       {
        tot=tot+nums[h];
        while(tot>=target)
        {
            int length=h-l+1;
            min=Math.min(min,length);
            tot=tot-nums[l];
            l++;
        }}
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
        }}