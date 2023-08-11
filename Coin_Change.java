//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends




// User function Template for Java

class Solution {
    long solve( int index, int coins[], int target, long dp[][]){
        
        if(target==0){
            return 1;
        }
        
        if(index==0){
            if(target%coins[0]==0){
                return 1;
            }
            return 0;
        }
        
        if(dp[index][target]!=-1){
            return dp[index][target];
        }
        
        //pick
        long pick = 0;
        
        if(coins[index]<=target){
            pick = solve(index,coins,target-coins[index],dp);
        }
        
        //not pick
        
        long notPick = solve(index-1,coins, target, dp);
        
        
        return dp[index][target]=pick+notPick;
        
        
    }
    
    public long count(int coins[], int n, int sum) {
        // code here.
        long dp[][] = new long[n][sum+1];
        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        long ans = solve(n-1,coins,sum,dp);
        
        return ans; 
    }
}
