class Solution {
    public int findKthPositive(int[] nums, int k) {
        int s=0,l=nums.length;
        
        while(s<l){
            int mid=s+(l-s)/2;
            
            if(nums[mid]-mid-1<k) s=mid+1;
            else l=mid;
        }
        return s+k;
    }
}