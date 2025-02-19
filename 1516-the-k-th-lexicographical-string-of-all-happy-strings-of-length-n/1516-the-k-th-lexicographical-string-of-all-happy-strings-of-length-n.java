class Solution {
    public String getHappyString(int n, int k) {
        List<String> finalSize = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

        while(!queue.isEmpty()) {
                String curr = queue.poll();
                if(curr.length() == n) {
                    finalSize.add(curr);
                    continue;
                }
                  char lastChar = curr.charAt(curr.length()-1);
                  if(lastChar == 'a') {
                    queue.offer(curr+'b');
                    queue.offer(curr+'c');
                  }
                  else if (lastChar == 'b') {
                    queue.offer(curr+'a');
                    queue.offer(curr+'c');
                  }
                  else if(lastChar == 'c') {
                    queue.offer(curr+'a');
                    queue.offer(curr+'b');
                  }
        }

        if(finalSize.size() < k) {
            return "";
        }
        return finalSize.get(k-1);
        
    }
}