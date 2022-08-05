class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        int mid = 0;
        long val;
        while(low <= high){
            mid = (high - low) / 2 + low;
            val = (long)mid * mid;
            if(val == num)
                return true;
            else if(val < num)
                low = mid + 1;
            else if(val > num)
                high = mid - 1;
        }
        return false;
    }
}