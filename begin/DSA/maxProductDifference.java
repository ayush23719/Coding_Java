class Solution {
    public int maxProductDifference(int[] nums) {
        int len = nums.length;
 
        int a = Integer.MIN_VALUE; 
        int b = a;                
        int c = Integer.MAX_VALUE; 
        int d = c;                
        
        for(int i = 0; i < len; i++) {
            if(nums[i] > a) {
                b = a;
                a = nums[i];
            } else if(nums[i] > b) {
                b = nums[i];
            }
            
            if(nums[i] < c) {
                d = c;
                c = nums[i];
            } else if(nums[i] < d) {
                d = nums[i];
            }
        }
        
        return (a * b) - (c * d);
    }
}