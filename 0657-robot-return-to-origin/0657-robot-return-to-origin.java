class Solution {
    public boolean judgeCircle(String moves) {
     /*   
        Map<Character,Integer> freq = new HashMap<>();

        for(int i=0;i<moves.length();i++) {
            char c = moves.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        return (freq.getOrDefault('U',0) == freq.getOrDefault('D',0) && 
        freq.getOrDefault('L',0) == freq.getOrDefault('R',0) );
        */
    int x = 0, y = 0;

    for (char c : moves.toCharArray()) {
        if (c == 'U') y++;
        else if (c == 'D') y--;
        else if (c == 'L') x--;
        else if (c == 'R') x++;
    }

    return x == 0 && y == 0;
    }
}