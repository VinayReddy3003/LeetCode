class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int totalSum = 0;
        for(int num :  nums) {
            totalSum += num;
        }
       int remainder = totalSum % k;

       return remainder;
    }
}