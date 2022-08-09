class Solution {
    public int[] runningSum(int[] nums) {
        int [] arr = new int[nums.length];
        int r= 0;
        for(int i = 0; i<nums.length; i++){
            r = r + nums[i];
            arr[i] = r;
        }
        return arr;
    }
}