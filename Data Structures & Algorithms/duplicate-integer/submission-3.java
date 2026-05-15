class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<Integer>();

        for (int num : nums) {
            if (n.contains(num)) {
                return true;
            }
            n.add(num);
        }
        return false;
    }
}