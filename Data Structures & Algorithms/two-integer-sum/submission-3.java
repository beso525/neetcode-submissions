class Solution {
    public int[] twoSum(int[] nums, int target) {
        // num[i] + num[j] = target & i != j
        int[] ans = new int[2];
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            num.put(nums[i], i);
        }

        int difference;
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            if (num.containsKey(difference) && i != num.get(difference)) {
                return new int[]{i, num.get(difference)};
            }
        }
        return ans;
    }
}
