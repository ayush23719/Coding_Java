class Solution {
    public int arrangeCoins(int n) {
        long start = 0, end = n, mid = start + (end - start) / 2, temp = 0;
        
        while (start <= end)
        {
            mid = start + (end - start) / 2;
            temp = mid * (mid + 1) / 2;
            
            if (n == temp)
                return (int)mid;
            else if (n > temp)
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return (int)end ;
    }
}