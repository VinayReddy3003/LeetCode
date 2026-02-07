class Solution {
    public int maxSum(int[] nums) {
       Set<Integer> filterNums = new HashSet<>();

        int sum = 0;
        int max_element= Integer.MIN_VALUE;

        for(int num : nums) {
            max_element = Math.max(max_element,num);
            if(num>0 && (!filterNums.contains(num))) {
                sum += num;
                 filterNums.add(num);
            }
        }

        if(sum == 0) {
            return max_element;
        }

        return sum;
    }
}