class Solution {
    
    public int countNumberOfOnes(int k){
        int answer=0;
        while(k!=0){
            answer++;
            k=k&(k-1);
        }
        return answer;
    }
    
    public boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    
    public int countPrimeSetBits(int left, int right) {
        int answer=0;
        for(int it=left;it<=right;it++){
            if(isPrime(countNumberOfOnes(it))){
                answer++;
            }
        }
        return answer;
    }
}