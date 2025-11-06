class Solution {
    public int numberOfWays(int n) {
        // code here
        int a=1;
        int b=2;
        int ans=0;
        if(n<3)return n;
        for(int i=2; i<n; i++){
            ans=a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
};
