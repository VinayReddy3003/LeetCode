class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenSet = new HashSet<>();
        for(char c:brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

        String[] words = text.split(" ");
        int count =0;
        for(int i = 0;i<words.length;i++) {
            boolean canType = true;
            for(char c: words[i].toCharArray()) {
                if(brokenSet.contains(c)) {
                    canType = false;
                    break;
                }
            }
            if(canType) {
                count++;
            }
        }
        return count;

    }
}