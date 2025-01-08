class Solution {

    private boolean isPrefix(String s1,String s2) {
        int m = s1.length();
        int n = s2.length();

        if(m>n) {
            return false;
        }

        for(int i = 0;i<m;i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSuffix(String s1,String s2) {
        int m= s1.length();
        int n= s2.length();

        if(m>n) {
            return false;
        }

        for(int i = m-1;i>=0;i--) {
            if(s1.charAt(i) != s2.charAt(n -(m-i))) {
                return false;
            }
        }
        return true;

    }
    public int countPrefixSuffixPairs(String[] words) {
        int len = words.length;
        int count = 0;
        for(int i = 0;i<len;i++) {
            for(int j =i+1;j<len;j++) {
                if(isPrefix(words[i],words[j]) && isSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
    return count;
    }
}