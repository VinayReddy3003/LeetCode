class Solution {
    private int find(int[] parents,int v) {
        if(parents[v] == -1) {
            return v;
        }
        else {
           return  parents[v] = find(parents,parents[v]);
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parents = new int[n+1];
        Arrays.fill(parents,-1);

        for(int[] edge :edges) {
            int parentX = find(parents,edge[0]);
            int parentY = find(parents,edge[1]);

            if(parentX == parentY) {
                return edge;
            } 
            else {
                parents[parentX] = parentY;
            }
        } 
        return new int[] {0,0};
    }
}