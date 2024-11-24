class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n= matrix.length;
         int negativeCount = 0;
         int minValue = Integer.MAX_VALUE;
         long totalSum = 0;
         for(int i=0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                int val = matrix[i][j];
                totalSum +=Math.abs(val);
                minValue= Math.min(minValue,Math.abs(val));
                if(val<0) {
                    negativeCount++;
                }
            }
         }
         if(negativeCount %2 !=0) {
            totalSum -= 2*minValue;
         }
         return totalSum;
    }
}