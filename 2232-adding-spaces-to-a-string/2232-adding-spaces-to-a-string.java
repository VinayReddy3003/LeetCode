class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer res = new StringBuffer();
        int i = 0;
        int j = 0;
        while(i <s.length()) {
            if(j<spaces.length && i == spaces[j]) {
                res.append(' ');
                j++;
            }
            res.append(s.charAt(i++));
        }
    return res.toString();
    }
    
}