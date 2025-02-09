class Solution {
    public long countBadPairs(int[] nums) {

        long n = nums.length;
        long GoodPairs =0;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i = 0;i<n;i++) {
            int key = nums[i]-i;
            if(freq.containsKey(key)) {
                GoodPairs +=freq.get(key);
            }
            freq.put(key,freq.getOrDefault(key,0)+1);
        }
        
        long badPairs = n*(n-1)/2 -GoodPairs;
        return badPairs;
    }
}