class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al = new ArrayList<>();
       int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            al.add(index[i], nums[i]);
              }
        for( int i = 0; i < nums.length; i++){
            result[i] = al.get(i);
        }
        return result;
    }
}