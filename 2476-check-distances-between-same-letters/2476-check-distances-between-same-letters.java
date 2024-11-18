class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] characterPosition = new int[26];
        Arrays.fill(characterPosition,-1);
        for(int i = 0;i<s.length();i++) {
            int charNumber = s.charAt(i)- 'a';
            if(characterPosition[charNumber] != -1) {
                 int distanceBetweenCharacter = i- characterPosition[charNumber]-1;
                 if(distanceBetweenCharacter != distance[charNumber]) {
                    return false;
                 }
            }

            else {
                characterPosition[charNumber] = i;
            }
        } 
        return true;
    }
}