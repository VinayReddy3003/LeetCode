class Solution {
    public int missingNumber(int[] nums) {
         int max = Integer.MIN_VALUE;
	   int actualSum=0;
	   for(int i =0;i<nums.length;i++) {
	       actualSum += nums[i];
		   if(max<nums[i]) {
			   max = nums[i];
		   }
	   }
	   int orgSum = max* (max+1)/2;
	   int diff = orgSum - actualSum;
	   int missednum = 0;
	   if(diff != 0) {
		   missednum = diff;
	   }
	   else if (max != nums.length) {
		   missednum = max+1;
	   }
	   return missednum;
    }
}