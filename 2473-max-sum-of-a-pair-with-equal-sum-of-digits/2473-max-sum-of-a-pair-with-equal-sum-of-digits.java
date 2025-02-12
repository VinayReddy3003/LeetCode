class Solution {
    private int digitalSum(int ele) {
        int sum = 0;
        while(ele != 0) {
            sum += ele % 10;
            ele /= 10;
        }
        return sum;
    }


    public int maximumSum(int[] nums) {

        Map<Integer,Integer> digSumNums = new HashMap<Integer,Integer>();

        int MaxSum = -1;
        
        for(int elem: nums) {
            int digSum = digitalSum(elem); 

            if(digSumNums.containsKey(digSum)) {
                MaxSum =Math.max(MaxSum,elem + digSumNums.get(digSum) );
                if( elem > digSumNums.get(digSum)) {
                    digSumNums.put(digSum,elem);
                } 
            }
            else {
                digSumNums.put(digSum,elem);
            }
        }
        return MaxSum;


    }
}