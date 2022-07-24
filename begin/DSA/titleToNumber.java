class Solution {
    public int titleToNumber(String columnTitle) {
         int res=0;
         int k = columnTitle.length();
         if(k==0){
             return 0;
         }
         for(int i=0;i<k-1;i++){
             int a =columnTitle.charAt(i)-64; 
             res = res*26 + 26*a;
         }
         return res+columnTitle.charAt(k-1)-64;
     }
 }