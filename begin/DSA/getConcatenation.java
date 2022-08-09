class Solution {
    public int[] getConcatenation(int[] nums) {
      int[] ans = new int[nums.length * 2];
      int t = 0;
      while(t < 2) {
        int add = t* nums.length;
        for(int i = 0; i < nums.length; ++i) {
          ans[i + add] = nums[i];
        }
        ++t;
      }
      return ans;
    }
  }