class Solution {
    public int findComplement(int num) {
        int bits = Integer.toBinaryString(num).length();
    int maxBound = (int)( Math.pow(2, bits)-1);
    return num ^ maxBound;
}
}