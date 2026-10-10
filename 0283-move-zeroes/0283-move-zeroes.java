class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int result [] = new int[n];
        int insertPos=0;
//collect all non zeros element 
for(int num:nums){
    if(num !=0){
        result[insertPos]= num;
        insertPos++;
    }
}
//copy res back into nums
for(int i=0;i<n;i++){
    nums[i]=result[i];
}
        
    }
}