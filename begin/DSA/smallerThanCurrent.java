class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
		int n = nums.length;
        int a[] = new int [n];
		for(int i=0;i<n;i++) {
			int k=0;
			int count = 0;
			while(k!=n) {	
				if(nums[i]>nums[k]) {
					count = count+1;
					a[i] = count;
				} else {
					a[i] = count;
				}
				k++;
			}
		}
        return a;
    }
}