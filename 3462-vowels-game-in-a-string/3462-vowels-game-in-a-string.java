class Solution {
    public boolean doesAliceWin(String s) {
        boolean flag = false;
        int count = 0;
        for(char c:s.toCharArray()) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                count++;
            }
        }
        if(count > 0) {
            flag = true;
     
        }
     return flag;
    }
    
}