class Solution {
    public int[] twoSum(int[] n, int t)
     {
        int l=0;
        int r=n.length-1;
        while(l<r){
            int s=n[l]+n[r];
        
        if(s==t)
        {
            return new int[] {l+1,r+1};
           
        }
        else if(s<t){
            l++;
        }
        else{
            r--;
        }
     }
     return new int[] {};
     }
}