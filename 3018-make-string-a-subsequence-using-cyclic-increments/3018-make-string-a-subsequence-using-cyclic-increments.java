class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
     int j = 0;
     int n = str1.length();
     int m = str2.length();

     for(int i = 0;i<n;i++) {
        if(str1.charAt(i)== str2.charAt(j) || (str1.charAt(i)-'a'+1)%26 ==(str2.charAt(j)-'a')) {
            j++;
        }
        if(j == m) {
            return true;
        }
        
     }
    return false;
    }

}