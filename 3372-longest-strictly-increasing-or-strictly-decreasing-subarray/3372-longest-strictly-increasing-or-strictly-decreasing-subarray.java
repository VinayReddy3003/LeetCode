class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longestLength = 1;
        int StrictlyIncrease = 1;
        int StrictlyDecrease = 1;
        for(int i = 1;i<nums.length;i++) {

            if(nums[i-1] < nums[i]) {
                StrictlyIncrease++;
                StrictlyDecrease = 1;
            }
            else if(nums[i-1] > nums[i]) {
                StrictlyDecrease++;
                StrictlyIncrease=1;
            }
            else {
                StrictlyIncrease=1;
                StrictlyDecrease=1;
            }

        longestLength = Math.max(longestLength,Math.max(StrictlyIncrease,StrictlyDecrease));
        }

        return longestLength;
    }
}