class Solution {
    public String removeOccurrences(String s, String part) {

        // Keep removing 'part' until it is no longer present in 's'
        while (s.contains(part)) {

            // Find the position of the first occurrence of 'part'
            int index = s.indexOf(part);

            // Remove 'part' from the string
            // substring(0, index) -> characters before 'part'
            // substring(index + part.length()) -> characters after 'part'
            s = s.substring(0, index) + s.substring(index + part.length());
        }

        // Return the string after removing all occurrences of 'part'
        return s;
    }
}