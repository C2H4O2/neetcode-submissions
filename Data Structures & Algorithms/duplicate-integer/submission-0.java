class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ints = new HashSet<>();

        for (var n : nums) {
            if(!ints.contains(n)) {
                ints.add(n);
            }
            else{
                return true;
            }
        }

        return false;
    }
}