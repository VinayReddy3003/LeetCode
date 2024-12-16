class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) ->{
        if(a[0]!=b[0]) return a[0]-b[0];
        
        return a[1]-b[1];
       });
    for(int i = 0;i<nums.length;i++) {
        minheap.offer(new int[]{nums[i],i});
    }

    while(k-- >0) {
     int[] minElement = minheap.poll();
      int value = minElement[0];
      int index = minElement[1];

       nums[index] = value*multiplier;

       minheap.offer(new int[]{nums[index],index});

    }
    return nums;
    }
}