class Solution {
    private int lowerBound(int idx, int tar, int arr[][]){
        int n=arr.length;
        int st=idx;
        int ed=n-1;
        int ans=n;
        while(st<=ed){
            int m=st+(ed-st)/2;
            if(arr[m][0]>=tar){
                ans=m;
                ed=m-1;
            }else{
                st=m+1;
            }
        }
        return ans;
    }
    
    private int mem(int i, int jobs[][], int dp[]){
        if(i>=jobs.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int nxtIdx=lowerBound(i+1, jobs[i][1], jobs);
        int take=jobs[i][2]+mem(nxtIdx,jobs,dp);
        int notTake=mem(i+1,jobs,dp);
        return dp[i]=Math.max(take,notTake);
    }
    public int maxProfit(int[][] jobs) {
        // code here
        Arrays.sort(jobs, Comparator.comparingInt(a->a[0]));
        int dp[]=new int[jobs.length];
        Arrays.fill(dp,-1);
        return mem(0,jobs,dp);
    }
}
