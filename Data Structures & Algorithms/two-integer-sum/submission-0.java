class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numPtr = 0;
        int comPtr = 0;

        Set<Integer> numbers = new HashSet<>();
        
        for (var n : nums) {
            numbers.add(n);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(target-nums[i])) {
                numPtr = i;

                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[j] == target-nums[i]) {
                        comPtr = j;
                    }
                }
            }
        }

        return new int[]{ comPtr, numPtr};
    }
}
