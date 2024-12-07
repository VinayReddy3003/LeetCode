class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();
        
        while(left < right) {
            int mid = left +(right -left)/2;
            if(canDivide(nums,mid,maxOperations)) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }
    private boolean canDivide(int[] nums,int mid,int maxOperations) {
        int operationsUsed = 0;
        for(int num:nums) {
            operationsUsed += (num-1)/mid;

            if(operationsUsed>maxOperations) {
                return false;
            }
        }
        return true;
    }
}