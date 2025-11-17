

//User function Template for Java

class Solution
{
    //Top-Down
    int helper(int i, int prev, int[] arr, Integer[][] dp){
        if(i == arr.length) return 0;
        if(dp[i][prev] != null) return dp[i][prev]; 
        int pick = -1, notPick = -1;
        if(prev == 0 || arr[prev - 1] < arr[i]) pick = arr[i] + helper(i + 1, i + 1, arr, dp);
        notPick = helper(i + 1, prev, arr, dp);
        return dp[i][prev] = Math.max(pick, notPick);
    }
    //Bottom-up
    int helper2(int arr[], int n){
        int[][] dp = new int[arr.length + 1][arr.length + 1];
	    for(int i = arr.length - 1 ; i >= 0 ; i--){
	        for(int prev = i ; prev >= 0 ; prev--){
	            dp[i][prev] = dp[i + 1][prev];
	            if(prev == 0 || arr[prev - 1] < arr[i]) dp[i][prev] = Math.max(dp[i][prev], arr[i] + dp[i + 1][i + 1]); 
	        }
	    }
	    return dp[0][0];
    }
    //Bottom-up + Space Optimised
	public int maxSumIS(int arr[])  
	{  
	    int n=arr.length;
	    int[] dp = new int[arr.length + 1];
	    int[] prevDp = new int[arr.length + 1];
	    for(int i = arr.length - 1 ; i >= 0 ; i--){
	        dp = new int[arr.length + 1];
	        for(int prev = i ; prev >= 0 ; prev--){
	            dp[prev] = prevDp[prev];
	            if(prev == 0 || arr[prev - 1] < arr[i]) dp[prev] = Math.max(dp[prev], arr[i] + prevDp[i + 1]);
	        }
	        prevDp = dp;
	    }
	    return dp[0];
	}  
}
