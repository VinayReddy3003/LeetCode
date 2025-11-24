class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int number = 0;
        for(int num : nums) {
                number =( number*2 + num) % 5;
                result.add(number == 0);
        }
        return result;
    }
}