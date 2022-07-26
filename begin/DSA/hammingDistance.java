class Solution {
    public int hammingDistance(int x, int y) {
        int counter = 0;
        int xor = x^y;
        while(xor!=0){
            xor = xor&(xor-1);
            counter++;
        }
        return counter;
    }
}