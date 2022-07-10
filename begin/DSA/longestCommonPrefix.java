class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        for (int i = 0; i < temp.length(); i++) 
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i) 
                    return strs[j];
                if (temp.charAt(i) != strs[j].charAt(i)) 
                    return temp.substring(0, i);   
            }
        return temp;
    }
}