class Solution {
    public List selfDividingNumbers(int left, int right) {
    
        ArrayList<Integer> ans = new ArrayList<>();
        while(left<= right){
            
            if(check(left)){
                ans.add(left);
            }
            left++;
        }
        return ans;
        
    }
    
    public boolean check(int num){
         
        int res = num;
        while(num!=0){
            int rem = num%10;
            if(rem==0){
                return false;
            }
            else if(res % rem!= 0 ){
                return false;
            }
            else{
                num /=10;
            }
        }
        return true;
    }
    
    }