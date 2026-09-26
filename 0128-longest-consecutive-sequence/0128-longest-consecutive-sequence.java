import java.util.Set;
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        // Store all numbers in HashSet.
        // HashSet removes duplicates automatically
        // and gives O(1) average lookup.
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        // Check each unique number in the HashSet
        for (int n : set) {

            // If n-1 exists, then n is not the
            // starting point of a consecutive sequence.
            // So, skip it.
            if (set.contains(n - 1)) {
                continue;
            }

            // n is the starting number of a sequence
            int count = 1;

            // Start checking from the next number
            int num = n + 1;

            // Keep checking consecutive numbers
            // Example: 1 -> 2 -> 3 -> 4
            while (set.contains(num)) {
                num++;
                count++;
            }

            // Store the longest sequence found so far
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}










































// import java.util.*;
// class Solution{
//     public int longestConsecutive(int nums[]){
//         HashSet<Integer> s=new HashSet<>();
//         //put all element into hashset 
//         for(int num:nums){
//             s.add(num);
//         }
//         int maxLength=0;
//         //check every no. if n-1 not present thenit is sarting point of equence
//         for(int num:s){
//             if(!s.contains(num-1)){
//                 int current=num;
//                 int length=1;

//                 //find consecutive numbers like 1->2->3->4
//                 while(s.contains(current+1)){
//                     current++;
//                     length++;
//                 }
//                 //step 4:store the max length
//                 maxLength=Math.max(maxLength,length);
//             }
//         }
//         return maxLength;
//     }
// }