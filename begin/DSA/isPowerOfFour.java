class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) 
            return true;
        while(n>4){
            if((n&7)!=0) 
                return false;
            n >>= 2;
        }
        if(n==4) 
            return true;
        return false;
    }
}