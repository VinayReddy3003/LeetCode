class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int result = 0;
        for(int elem: derived){
            result ^= elem;
        }
        return result == 0;
    }
}