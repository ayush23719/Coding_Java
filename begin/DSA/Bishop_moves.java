public public class Solution {
    public int solve(int A, int B) {
         int count = 0;
   int min_left = Math.min(A, B) - 1;
   int max_left = 8 - Math.max(A, 9 - B);
   int max_right = 8 - Math.max(A, B);
   int min_right = Math.min(A, 9 - B) - 1;
   count = min_left + min_right + max_right + max_left;
   return count;
    }
} {
    
}
