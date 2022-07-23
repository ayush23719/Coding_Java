class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        if(columnNumber <= 26){
            ans += String.valueOf((char)('A' + columnNumber - 1));
        }else{
            int remain = columnNumber % 26;
            if(remain == 0){
                ans += String.valueOf((char)('A' + 25));
                ans = convertToTitle(columnNumber / 26 - 1) + ans;
            }else{
                ans += String.valueOf((char)('A' + remain - 1));
            ans = convertToTitle(columnNumber / 26) + ans;
            }
            
        }
        return ans;
    }
}