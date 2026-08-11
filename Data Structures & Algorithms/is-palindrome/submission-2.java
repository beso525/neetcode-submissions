class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l += 1;
            }
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                r -= 1;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l += 1;
            r -= 1;
        }

        return true;
    }
}
