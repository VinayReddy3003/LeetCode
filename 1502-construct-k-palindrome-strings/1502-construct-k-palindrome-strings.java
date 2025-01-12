class Solution {
    public boolean canConstruct(String s, int k) {
        HashMap<Character,Integer> CharCount = new HashMap<>();
        

        if(s.length()<k) {
            return false;
        }
        for(char c :s.toCharArray()) {
            CharCount.put(c,CharCount.getOrDefault(c,0)+1);
        }
        int oddCount  = 0;

        for(int count :CharCount.values()) {
            if(count % 2 != 0 ) {
                oddCount++;
            }
        }
        return oddCount<=k;
    }
}