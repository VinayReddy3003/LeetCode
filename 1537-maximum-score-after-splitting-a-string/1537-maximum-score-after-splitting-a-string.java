class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int onecount = 0;
        for(int i = 0;i<n;i++) {
            if(s.charAt(i) == '1') {
                onecount++;
            }
        }
        int zerocount = 0;
        int maxCount = 0;
        for(int i = 0;i<n-1;i++) {
            if(s.charAt(i) == '1') {
                onecount--;
            }
            else {
                zerocount++;
            }
            maxCount  = Math.max(maxCount,zerocount+onecount);
        }
    return maxCount;
    }
}