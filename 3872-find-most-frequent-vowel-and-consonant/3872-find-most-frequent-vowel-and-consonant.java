class Solution {

    private boolean isVowel(char c) {
         boolean flag = false;
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            flag = true;
        }
        return flag;
    }

    public int maxFreqSum(String s) {
        Map<Character,Integer> vowelFrequency = new HashMap<>();
        Map<Character,Integer> consoFrequency = new HashMap<>();

        for(char c: s.toCharArray()) {
            if(isVowel(c)) {
                vowelFrequency.put(c,vowelFrequency.getOrDefault(c,0)+1);
            }
            else {
                consoFrequency.put(c,consoFrequency.getOrDefault(c,0)+1);
            }
        }
        int maxVowelFreq = 0;
        for(int freq : vowelFrequency.values()) {
            if(freq > maxVowelFreq) {
                maxVowelFreq = freq;
            }
        }
        int maxConsoFreq = 0;
        for(int freq:consoFrequency.values() ) {
            if(freq > maxConsoFreq) {
                maxConsoFreq = freq;
            }
        }
        return maxVowelFreq+maxConsoFreq;
    }
}