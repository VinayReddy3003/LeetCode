class Solution {
    public int minOperations(int[] nums, int k) {
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num:nums) {
            pq.offer((long) num);
        }

        int Count = 0;

        while(pq.peek() < k) {
            long firstSmall = pq.poll();
            long secondSmall = pq.poll();

            long CalSum = Math.min(firstSmall,secondSmall) * 2 + Math.max(firstSmall,secondSmall);

            pq.offer(CalSum);
            Count++;
        }

        return Count;
    }
}