class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
    
        for(int gift: gifts) {
            maxHeap.add(gift);
        }

        for(int i=0;i<k;i++) {
            int maxGifts = maxHeap.poll();
            int remainingGifts =(int) Math.sqrt(maxGifts);
            maxHeap.add(remainingGifts);
        }


        long sum = 0;
        while(!maxHeap.isEmpty()) {
            sum +=maxHeap.poll();
        }
        return sum;
    }
}