class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    void solve(String s, int index, List<String> temp, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            String str = s.substring(index, i + 1);

            if (isPalindrome(str)) {
                temp.add(str);
                solve(s, i + 1, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}