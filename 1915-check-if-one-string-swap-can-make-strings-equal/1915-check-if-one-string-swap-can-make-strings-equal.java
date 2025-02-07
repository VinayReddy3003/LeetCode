class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }
        else {
             int m = s1.length();
             int n = s2.length();


              
              List<Character> misMatches = new ArrayList<Character>();
              int pos = 0;
              while(pos < m) {
                  if(s1.charAt(pos) != s2.charAt(pos)) {
                    misMatches.add(s1.charAt(pos));
                    misMatches.add(s2.charAt(pos));
                   
                  }
                  pos++;
              }
              if(misMatches.size() == 4) {
                 return  (misMatches.get(0) == misMatches.get(3) && misMatches.get(1) == misMatches.get(2));
              }
              return false;
        }
    }
}