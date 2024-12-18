class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[n];

        for(int i = n-1;i>=0;i--) {
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                result[i] = prices[i];
            }
            else {
                result[i] = prices[i] - prices[stack.peek()];
            }
            stack.push(i);
        }
        return result;
    }
}