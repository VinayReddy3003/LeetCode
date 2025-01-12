class Solution {
    private void setMaxFrequency(int[] freqwords2,int[] freq) {
        for(int i = 0;i<26;i++) {
            freqwords2[i] = Math.max(freqwords2[i],freq[i]);
        }
    }

    private boolean isUniversal(int[] freq_word,int[] freqwords2) {
        for(int i = 0;i<26;i++) {
            if(freq_word[i] < freqwords2[i]) {
                return false;
            }
        }
        return true;
    }

    
    public List<String> wordSubsets(String[] words1, String[] words2) {
        //Step -1
        int[] freqwords2 = new int[26];
        for(String word:words2) {
            int[] freq = new int[26];
            for(char c:word.toCharArray()) {
                freq[c-'a']++;
            }
            setMaxFrequency(freqwords2,freq);
        }

        List<String> UniversalString = new ArrayList<String>();
        for(String word:words1) {
            int[] freq_word = new int[26];
            for(char c:word.toCharArray()) {
                freq_word[c-'a']++;
            }
         
            if(isUniversal(freq_word,freqwords2)) {
                UniversalString.add(word);
            }
        }
        return UniversalString;
    }
}