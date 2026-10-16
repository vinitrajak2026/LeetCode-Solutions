//even after rotation one half of array is always sorted for any middle elem :if(n[l]<=n[m]) then left half is sorted check if target lies between them
//else check if right half is sorted. check if target lies between n[m] and n[r] :if yes search in right half else left half 

class Solution {
    public int search(int[] nums, int target) {
       int left=0;
       int right=nums.length-1;

       while(left<=right){
        //find middle index
    int mid=left+(right-left)/2;
    //target found
    if(nums[mid]==target){
        return mid;
    }
      // Check if left half is sorted
            if (nums[left] <= nums[mid]) {

                // Target lies inside the sorted left half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // search left side
                } else {
                    left = mid + 1;  // search right side
                }
            }

            // Otherwise right half must be sorted
            else {

                // Target lies inside the sorted right half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;  // search right side
                } else {
                    right = mid - 1; // search left side
                }
            }
        }

        // Target not found
        return -1;
    }
}
// Dry Run: Input
// nums = [4,5,6,7,0,1,2]
// target = 0
// Iteration 1
// left = 0, right = 6
// mid = 3  => nums[mid] = 7

// Left half [4,5,6,7] is sorted.

// target = 0
// 0 is NOT between 4 and 7

// Search right half:

// left = mid + 1 = 4
// Iteration 2
// left = 4, right = 6
// mid = 5 => nums[mid] = 1

// Left half [0,1] is sorted.

// 0 is between 0 and 1

// Search left half:

// right = mid - 1 = 4
// Iteration 3
// left = 4, right = 4
// mid = 4 => nums[mid] = 0

// Target found.

// return 4;
// Output
// 4
// Complexity Analysis
// Time Complexity: O(log n) (Binary Search)
// Space Complexity: O(1) (No extra space used)