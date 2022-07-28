class Solution {
    public int binaryGap(int n) {
            String str=Integer.toBinaryString(n);
        int d=0;
        int maxi=0;
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='1'){
                maxi=Math.max(i-d,maxi);
                d=i;
            }
        }
        return maxi;
    }
}
