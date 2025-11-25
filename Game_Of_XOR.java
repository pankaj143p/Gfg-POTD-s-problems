class Solution {
    static int subarrayXor(int[] a) {
        // code here
        int n=a.length;
        int ans=0;
        if(n%2!=0){
            for(int i=0;i<n;i+=2){
                ans^=a[i];
            }
        }
        return ans;
    }
};
