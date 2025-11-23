class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        List<Integer> remainder1 = new ArrayList<>();
        List<Integer> remainder2 = new ArrayList<>();

        for(int num : nums) {
            if(num % 3 == 1) {
                remainder1.add(num);
            }
            else if( num % 3 == 2) {
                remainder2.add(num);
            }
            sum += num;
        }

        Collections.sort(remainder1);
        Collections.sort(remainder2);

        if(sum % 3 == 0) {
            return sum;
        }
        else if(sum % 3 == 1) {

            int result1 = Integer.MIN_VALUE;
            int result2 = Integer.MIN_VALUE;

            if(remainder1.size() >=1) 
                result1 = sum-remainder1.get(0);
            if(remainder2.size() >=2) 
                result2 = sum - remainder2.get(0) - remainder2.get(1);

            sum =  Math.max(result1,result2);
        }
        else if(sum % 3 == 2) {
             int result1 = Integer.MIN_VALUE;
             int result2 = Integer.MIN_VALUE;

             if(remainder2.size()>=1) 
                 result1 = sum-remainder2.get(0);
             if(remainder1.size() >=2) 
                 result2 = sum - remainder1.get(0) - remainder1.get(1);

            sum = Math.max(result1,result2);
        }
        return sum;
    }
    
}