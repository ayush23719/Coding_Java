class Solution {
    public int[] plusOne(int[] digits) {
        int[] arr=new int[digits.length+1];
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }else{
            int dig=1;            
            for(int i=digits.length-1;i>=0;i--){
                int t=digits[i]+dig;
                digits[i]=(digits[i]+dig)%10;
                dig=t/10;
                if(dig==0){
                    return digits;
                }
            }
            arr[0]=dig;
            for(int j=0;j<digits.length;j++){
                arr[j+1]=digits[j];
            }
        }
        return arr;
    }
}