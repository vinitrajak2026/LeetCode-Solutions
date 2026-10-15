 class Solution{
    public int  peakIndexInMountainArray(int [] arr){
        int left=0;//initilize at left pointer
        int right=arr.length-1;//initilize at right pointer
        while(left<right){
            //calculate the middle index safely
            int m=left+(right-left)/2;
            //case 1:if next elem is greater than middle elem mean we are in increasing slope so peak is at right of mid
            if(arr[m]<arr[m+1]){
                left=m+1;
            }
           //case2:we are in dec slopeor mid itself is peak
           else{
            //keep mid in search spavce and eliminate right side
            right=m;
           } 
        }
        //when left==right both [ointer indicate peak idx
return left;
    }
 }