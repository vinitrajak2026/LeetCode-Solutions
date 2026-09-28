class Solution {

    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        /*
         * We want to place every positive number x
         * at index x - 1.
         *
         * Example:
         * 1 should be at index 0
         * 2 should be at index 1
         * 3 should be at index 2
         * ...
         */

        for (int i = 0; i < n; i++) {

            /*
             * Check whether nums[i] is useful.
             *
             * nums[i] >= 1
             *     -> Ignore 0 and negative numbers
             *
             * nums[i] <= n
             *     -> Numbers greater than n are not useful
             *
             * nums[nums[i] - 1] != nums[i]
             *     -> Avoid duplicate values and infinite loop
             */
            while (nums[i] >= 1 &&
                   nums[i] <= n &&
                   nums[nums[i] - 1] != nums[i]) {

                /*
                 * Suppose:
                 * nums[i] = 3
                 *
                 * 3 should go to index:
                 * 3 - 1 = 2
                 */

                int temp = nums[i];

                // Put the correct value at its correct index
                nums[i] = nums[temp - 1];

                nums[temp - 1] = temp;
            }
        }

        /*
         * Now check the array.
         *
         * At index i, we expect:
         * nums[i] = i + 1
         *
         * Example:
         * index 0 -> should contain 1
         * index 1 -> should contain 2
         * index 2 -> should contain 3
         */
        for (int i = 0; i < n; i++) {

            /*
             * If the expected number is missing,
             * then i + 1 is our answer.
             */
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        /*
         * If all numbers from 1 to n are present,
         * then the missing positive number is n + 1.
         *
         * Example:
         * [1, 2, 3]
         * Answer = 4
         */
        return n + 1;
    }
}




//         int n = nums.length;

//         // Check numbers from 1 to n
//         for (int num = 1; num <= n; num++) {

//             boolean found = false;

//             // Search num in the array
//             for (int i = 0; i < n; i++) {

//                 if (nums[i] == num) {
//                     found = true;
//                     break;
//                 }
//             }

//             // If num is not present, it is the answer
//             if (!found) {
//                 return num;
//             }
//         }

//         // If 1 to n are present
//         return n + 1;
//     }
// }