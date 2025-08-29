class Solution {
    public long flowerGame(int n, int m) {
        long OddsInN = (n+1)/2;
        long EvensInM = m/2;

        long count = OddsInN * EvensInM;

        long EvensInN = n/2;
        long OddsInM = (m+1)/2;
        count += EvensInN*OddsInM;

    return count;
    }
}