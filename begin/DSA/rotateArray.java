class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int gcd=n-k;
        reverse(0,gcd-1,nums);
        reverse(gcd,n-1,nums);
        reverse(0,n-1,nums);
    }
    void reverse(int s,int e,int[] nums)
    {
        while(s<e)
        {
            int temp=nums[e];
            nums[e]=nums[s];
            nums[s]=temp;
            s++;
            e--;
        }
    }
}