class Solution {
    public boolean isAnagram(String s, String t)
     {
        // Step 1: If lengths are different, they can never be anagrams.
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create an array to store frequency of each lowercase letter. Index 0 -> 'a'
        // Index 1 -> 'b'  ...  Index 25 -> 'z'
        int[] count = new int[26];

        // Step 3:  Traverse both strings together.
        for (int i = 0; i < s.length(); i++) {

            // Increase count for character from string s.
            count[s.charAt(i) - 'a']++;

            // Decrease count for character from string t.
            count[t.charAt(i) - 'a']--;
        }
        // Step 4: If every value becomes 0,  both strings contain the same characters.
        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }
        // All character frequencies matched.
        return true;
    }
}