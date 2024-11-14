class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int m = queries.length;
        int n = items.length;

        Arrays.sort(items,(a,b) -> a[0]-b[0]);
        TreeMap<Integer,Integer> maxBeautyMap = new TreeMap<>();
           int maxBeauty = 0;
           for(int[] item : items) {
            maxBeauty = Math.max(maxBeauty,item[1]);
            maxBeautyMap.put(item[0],maxBeauty);
           }
           int[] answer = new int[m];
           for(int i = 0;i<m;i++) {
            Integer key = maxBeautyMap.floorKey(queries[i]);
            answer[i] = key == null ? 0:maxBeautyMap.get(key);
           }
        return answer;

    }
}