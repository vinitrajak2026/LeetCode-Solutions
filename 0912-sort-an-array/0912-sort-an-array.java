class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
        
    }
    public void mergeSort(int [] nums,int low,int high){
        if(low>=high){
            return;
        }
        int m=low+(high-low)/2;
        mergeSort(nums,low,m);
        mergeSort(nums,m+1,high);
        merge(nums,low,m,high);
    }
    public void merge(int [] nums,int low,int m,int high){
        int [] temp=new int [high-low+1];
        int i=low;
        int j=m+1;
        int k=0;

        while(i<=m && j<=high){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=m){
            temp[k++]=nums[i++];
        }
        while(j<=high){
            temp[k++]=nums[j++];
        }
        for(int x=0;x<temp.length;x++){
            nums[low+x]=temp[x];
        }
    }

}