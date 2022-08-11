class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] opr= new int[2*n];
        int j=0;
        for(int i=0;i<n ;i++){
         j=2*i;
            opr[j]=nums[i];
            j++;
            opr[j] =nums[n+i];
        }
        return opr;     
    }
}