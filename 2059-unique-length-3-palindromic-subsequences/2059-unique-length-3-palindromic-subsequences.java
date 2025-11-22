class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length(); //5
        int result = 0;

        for(char c='a';c<='z';c++) {
            int left = s.indexOf(c);
            int right = s.lastIndexOf(c);

            if(right != -1 && left < right) {
                Set<Character> middleCharacters = new HashSet<>();
                
                for(int i = left+1;i<right;i++) {
                    middleCharacters.add(s.charAt(i));
                }

                result += middleCharacters.size();
            }
        }
        return result;
    }
}