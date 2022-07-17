class Solution {
    public int mySqrt(int x) {
        long res = -1;
        long low = 0;
        long high = x;
        while(low<=high){
            long mid = low+(high-low)/2; 
            if(mid*mid==x) return (int) mid;  
            else if(x>(mid*mid)){
                res = mid;
                low=mid+1;
            } else{
                high = mid-1;
            }
        }
        return (int)res;  
    }
    
    }