class Solution {
    public int search(int[] a, int target) {
        int low = 0;
        int high = a.length-1;
        
        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid] == target) return mid;
            if(a[mid] >= a[low]){
                if(target < a[mid] && target >= a[low]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target > a[mid] && target <= a[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}