class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> values = new HashSet<>();
        for(int num : nums) {
            values.add(num);
        }

        while(values.contains(original)) {
                original *= 2;
        }
        return original;
    }
}