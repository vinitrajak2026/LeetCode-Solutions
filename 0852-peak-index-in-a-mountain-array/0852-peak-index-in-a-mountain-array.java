// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int left=0;
//         int right=arr.length-1;
//         //binary search
//         while(left<right){
//             int mid=left+(right-left)/2;
//  // If current element is smaller than next element, we are on the increasing slope.Peak must be on the right side.
//  if(arr[mid]<arr[mid+1])
//  {
//     left=mid+1;
//  }
//  //else we are in decreasing slope or exactly at the peak keep mid in the search space
//  else
//  {
//     right=mid;
//      }
//   }
// // When left == right, we have found the peak index.
//         return left;
//     }
// }

class Solution{
    public int peakIndexInMountainArray(int arr[])
    {
        int n=arr.length;
        int maxx=arr[0];
        int idx=0;

        for(int i=1;i<n;i++){
            if(arr[i]>maxx){
                maxx=arr[i];
                idx=i;
            }
        }
        return idx;
    }
}