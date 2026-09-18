class Solution {

    public double findMaxAverage(int[] nums, int k) {

        // Step 1: Calculate sum of first k elements
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        // Store the first window's sum as maximum sum
        double maxSum = sum;

        // Step 2: Move the window one position at a time
        for (int i = k; i < nums.length; i++) {

            // Add the new element
            // Remove the element that is going out of the window
            sum = sum + nums[i] - nums[i - k];

            // Update maximum sum
            maxSum = Math.max(maxSum, sum);
        }

        // Average = maximum sum / number of elements
        return maxSum / k;
    }
}