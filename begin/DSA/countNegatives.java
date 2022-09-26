class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for(int[] nums : grid) {
            sum += getCount(nums);
        }
        return sum;
    }
    
    
    public int getCount(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        
        while(low<=high) {
            int mid = low + (high - low) / 2;
            
            if(numbers[mid] >=0 ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
            
        }
        return numbers.length - low;
        
    }
    
}