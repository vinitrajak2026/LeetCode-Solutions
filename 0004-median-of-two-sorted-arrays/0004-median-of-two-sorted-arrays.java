class Solution {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
if (nums1.length > nums2.length) {
return findMedianSortedArrays(nums2, nums1);
}
    int m = nums1.length;
    int n = nums2.length;

    int l = 0;
    int h = m;

    while (l <= h) {
        int par1 = l + (h - l) / 2;
        int par2 = (m + n + 1) / 2 - par1;

        int maxl = (par1 == 0)
                ? Integer.MIN_VALUE
                : nums1[par1 - 1];

        int minr = (par1 == m)
                ? Integer.MAX_VALUE
                : nums1[par1];

        int maxl2 = (par2 == 0)
                ? Integer.MIN_VALUE
                : nums2[par2 - 1];

        int minr2 = (par2 == n)
                ? Integer.MAX_VALUE
                : nums2[par2];

        if (maxl <= minr2 && maxl2 <= minr) {
            if ((m + n) % 2 == 1) {
                return Math.max(maxl, maxl2);
            }

            int lmax = Math.max(maxl, maxl2);
            int rmin = Math.min(minr, minr2);

            return ((double) lmax + rmin) / 2.0;
        } else if (maxl > minr2) {
            h = par1 - 1;
        } else {
            l = par1 + 1;
        }
    }

    throw new IllegalArgumentException("Invalid input arrays");
}
}
