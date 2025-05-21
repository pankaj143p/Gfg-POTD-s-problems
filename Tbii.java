

class Solution {
   public int kthSmallest(int m, int n, int k) {
        //Write your code here
        int low = 1, high = m*n;
         while(low < high){
             int mid = low + (high-low)/2;
             int capacity = count(mid, m,n);
             if(capacity >= k) high = mid;
             else 
                low = mid + 1;
             
             
         }
         return low;
    }
    public int count(int mid, int n, int m){
        int count = 0;
        for(int i =1 ; i <=m; i++){
            int temp = Math.min(mid/i, n);
            count += temp;
        }
        return count;
    }

}
