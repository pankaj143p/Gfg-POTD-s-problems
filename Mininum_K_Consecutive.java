class Solution {
    public int kBitFlips(int[] nums, int k) {
        // code here
         int i=0;
        int ans=0;
        int flip=0;
        int n=nums.length;
        while(i<n){
            if(i>=k && nums[i-k]==-1){
                flip--;
            }
            if(flip%2==nums[i]){
                if(i+k>n)
                    return -1;
                ans++;
                flip++;
                nums[i]=-1;
            }
            i++;
        }
        return ans;
    }
}
