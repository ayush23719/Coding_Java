class Solution {
    public int[] numberOfPairs(int[] nums) {
    
        int[] freq = new int[101];
        
        for(int i: nums){
            freq[i]++;
        }
        
        int[] ans = new int[2];
        int pairs=0, leftovers=0;
        
        for(int i=0; i<freq.length; i++){
            pairs += freq[i]/2;
            leftovers += freq[i]%2;
        }
        
        ans[0] = pairs;
        ans[1] = leftovers;
        
        return ans;
        
    }
    
    }