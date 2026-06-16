class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> anagram1 = new HashMap<>();
        HashMap<Character, Integer> anagram2 = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
                anagram1.put(s.charAt(i),
                 anagram1.getOrDefault(s.charAt(i), 0) + 1);

                anagram2.put(t.charAt(i),
                 anagram2.getOrDefault(t.charAt(i), 0) + 1);
            }
        return anagram1.equals(anagram2);
    }
}
