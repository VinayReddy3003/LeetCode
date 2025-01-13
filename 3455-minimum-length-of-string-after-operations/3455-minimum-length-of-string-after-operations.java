class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()) {
             freq[c-'a']++;
        }

        int length = 0;
        for(int count:freq) {
            if(count % 2 == 1) {
                length += 1;
            }
            else {
                length += Math.min(2,count);
            }
        }
        return length;
    }
}