class Solution {
    public int numberOfBeams(String[] bank) {
        int tot = 0;
        int prev = 0;
        int co = 0;
        for(int i = 0; i < bank.length; i ++) {
            for (int j=0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    co++;
                }
            }
            
            if(co > 0) {
                tot += prev * co; 
                prev = co;
            }
            co = 0;
        }
        return tot;
    }
    }