class Solution {
    public int removeDuplicates(int[] nums) {
//      int s=0,//// slow points to the last unique element
//      f=1;
//      for(f=1;f<nums.length;f++){
// // Check if current element is different from the last unique elemen
//         if(nums[f]!=nums[s]){
//             s++;
// // Copy the new unique element to the slow position
//             nums[s]=nums[f];
//         }
//      }  
// // slow is an index, so add 1 
//      return s+1;
//     }
//}
int i=0;int k=1;
for(int j=1;j<nums.length;j++){
    if(nums[i]!=nums[j]){
  i++;
  nums[i]=nums[j];
  k++;

    }
}
return k;
    }
}
 