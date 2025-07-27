class Solution {
    public int countHillValley(int[] nums) {
        if(nums==null && nums.length <3) {
            return 0;
        }
        List<Integer> filterNums = new ArrayList<>();
        filterNums.add(nums[0]);
        for(int i = 1;i<nums.length;i++) {
            if(nums[i-1] != nums[i]) {
                filterNums.add(nums[i]);
            }
        }

        int count =0;
        if(filterNums.size()<3) {
             return count;
        }
        for(int i = 1;i<filterNums.size()-1;i++) {
            int prev = filterNums.get(i-1);
            int curr = filterNums.get(i);
            int next = filterNums.get(i+1);

            if(curr > prev && curr > next) {
                count++;
            }
            else if(curr < prev && curr <next ) {
                count++;
            }
        }

        return count;
    }
} 