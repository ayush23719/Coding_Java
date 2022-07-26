class Solution {
    public int minBitFlips(int start, int goal) {
        int x=start ^ goal;
        int flipCount=0;
        while(x>0)
        {
            flipCount += x & 1;
            x>>=1;
        }
        return flipCount;
    }
}