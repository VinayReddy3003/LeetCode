class Solution {
    public int maxOperations(String s) {
        int no_ofones = 0;
        int n = s.length();
        int result = 0;

        for(int i = 0;i < n;i++) {

            if(s.charAt(i) == '1') {
                no_ofones++;
            }
            if(s.charAt(i)=='0' && i > 0 && s.charAt(i-1)=='1') {
                result += no_ofones;
            }
        }
    
    return result;
    }
}