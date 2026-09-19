class Solution {
    public int longestOnes(int[] nums, int k) {
    // L = left side of window
    // zeros = number of 0s inside current window
    // maxLen = longest valid window found so far
    int L = 0, zeros = 0, maxLen = 0;

    // R = right side of window
    // Slowly move R from left to right
    for (int R = 0; R < nums.length; R++) {

        // If current element is 0,
        // we need to flip this 0 to 1
        if (nums[R] == 0) {
            zeros++;
        }

        // If zeros become greater than k,
        // current window is invalid
        while (zeros > k) {

            // If the element leaving from left is 0,
            // reduce the zero count
            if (nums[L] == 0) {
                zeros--;
            }

            // Move left pointer forward
            L++;
        }

        // Current window = L to R
        // Length = R - L + 1
        maxLen = Math.max(maxLen, R - L + 1);
    }

    // Return the longest valid window
    return maxLen;
}
        
    }
