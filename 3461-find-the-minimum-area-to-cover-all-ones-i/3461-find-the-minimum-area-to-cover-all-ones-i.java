class Solution {
    public int minimumArea(int[][] grid) {
        int low_x = Integer.MAX_VALUE;
        int high_x = -1;
        int low_y = Integer.MAX_VALUE;
        int high_y = -1;

        for(int i = 0;i<grid.length;i++) {
            for(int j = 0;j<grid[i].length;j++) {
                if(grid[i][j] == 1 ) {
                    low_x= Math.min(low_x,i);
                    high_x=Math.max(high_x,i);
                    low_y = Math.min(low_y,j);
                    high_y = Math.max(high_y,j);
                }
            }
        }
        int area = (high_x - low_x+1) * (high_y - low_y + 1); 
        return area;
    }
    
}