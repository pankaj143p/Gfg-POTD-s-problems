class Solution {
    public int maxOnes(int arr[], int m) {
        // code here
        int cnt = 0;
        int ans = 0;
        int n=arr.length;
        int j=0,i=0;
        while(i<n){
            if(arr[i]==0){
                cnt++;
            }
            if(cnt>m){
                if(arr[j]==0){
                    cnt--;
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}
