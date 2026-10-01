// class Solution 
// {
//     public void merge(int[] nums1, int m, int[] nums2, int n)
//      {
//      int i=m-1;
//      int j=n-1;
//      int k=m+n-1;
//      while(i>=0&&j>=0){
//         if(nums1[i]>nums2[j]){
//             nums1[k]=nums1[i];
//             i--;
//         }
//         else
//         {
//             nums1[k]=nums2[j];
//             j--;
//         }
//         k--;
//      } 
//      while(j>=0)
//      {
//         nums1[k]=nums2[j];
//         j--;
//         k--;
//      }
//     }
// }

class Solution{
public void merge(int[] nums1, int m, int[] nums2, int n) {
    // p1 = nums1 ke actual elements ka last index
    // m = nums1 mein actual kitne elements hain
    int p1 = m - 1, p2 = n - 1, p = m + n - 1;
    while (p1 >= 0 && p2 >= 0) {
        // Jab tak nums1 aur nums2 elements available hain, comparison karte raho
        if (nums1[p1] > nums2[p2]) {
 // nums1 ka current last element bada hai// toh usko nums1 ke last empty position par rakho
            nums1[p--] = nums1[p1--];
// p--  → p ko ek position left move karo // p1-- → p1 ko ek position left move karo

        } else {
            // Agar nums2 ka element bada ya equal hai, // toh nums2[p2] ko nums1[p] mein rakho

            nums1[p--] = nums2[p2--];
 // p--  → next empty position // p2-- → nums2 ka previous element
        }
    }
    while (p2 >= 0)
 // Agar nums2 mein kuch elements abhi bhi bach gaye hain,unko nums1 mein copy kar do
        nums1[p--] = nums2[p2--];
}
}

// Set p1=m-1, p2=n-1, p=m+n-1 (write from end)
// While p1≥0 and p2≥0: compare nums1[p1] vs nums2[p2]
// Write the larger value at nums1[p], advance that pointer left
// Copy remaining nums2 elements (if any)