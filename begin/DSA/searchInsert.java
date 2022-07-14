class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = high+low/2;
        while(low<=high){
            if(nums[mid]<target)
                low = mid+1;
            else if(nums[mid]>target)
                high = mid-1;
            else
                return mid;
            
            mid = high+low/2;
        }
        return low;
        
        
    }
}