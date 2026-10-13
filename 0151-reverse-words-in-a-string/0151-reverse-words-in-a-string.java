class Solution {
 public static String reverseWords(String s)
  {
        Stack<String> st = new Stack<>();
        String temp = "";

        int n = s.length();

        // Extract words and push into stack
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch == ' ') {

                // Push only if word exists
                if (temp.length() > 0) {
                    st.push(temp);
                    temp = "";
                }
            }
            else {

                // Build current word
                temp += ch;
            }
        }

        // Push last word
        if (temp.length() > 0) {
            st.push(temp);
        }

        // Build reversed string
        String ans = "";

        while (!st.isEmpty()) {

            ans += st.pop();

            if (!st.isEmpty()) {
                ans += " ";
            }
        }

        return ans;
    }   
    }

// class Solution {
//     public String reverseWords(String s) {
//         // Trim the input string to remove leading and trailing spaces
//         String[] str = s.trim().split("\\s+");

//         // Initialize the output string
//         String out = "";

//         // Iterate through the words in reverse order
//         for (int i = str.length - 1; i > 0; i--) {
//             // Append the current word and a space to the output
//             out += str[i] + " ";
//         }

//         // Append the first word to the output (without trailing space)
//         return out + str[0];
//     }
// }