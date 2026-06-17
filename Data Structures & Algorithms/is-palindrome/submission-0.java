class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        String lettersOnly = s.replaceAll("[\\W]", "").toLowerCase();
        for (int i = lettersOnly.length() - 1; i >= 0; i--) {
            System.out.println(lettersOnly.charAt(i));
            sb.append(lettersOnly.charAt(i));
        }
        String original = sb.toString();
        return original.equals(lettersOnly);
    }
}
