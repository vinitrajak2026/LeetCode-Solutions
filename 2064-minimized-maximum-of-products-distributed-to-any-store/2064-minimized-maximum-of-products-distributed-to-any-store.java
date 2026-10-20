class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        // Minimum possible maximum products per store
        int l = 1;
        // Maximum possible answer is the largest quantity
        int r = 0;
        for (int q : quantities) {
            r = Math.max(r, q);
        }
        int ans = r;

        // Binary Search
        while (l <= r) {
            // Find the middle value
            int m = l + (r - l) / 2;
            // Count how many stores are needed
            int store = 0;
            for (int q : quantities) {
                // Calculate stores needed for this product type
                // (q + m - 1) / m calculates ceiling of q / m
                store += (q + m - 1) / m;
            }
            // If required stores are within the available limit
            if (store <= n) {
                // m is a possible answer
                ans = m;
                // Try to find an even smaller answer
                r = m - 1;
            }
            else {
                // Too many stores are required
                // Increase the maximum products per store
                l = m + 1;
            }
        }
        return ans;
    }
}
