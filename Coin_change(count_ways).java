

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int sum = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(arr, sum));
            System.out.println("~");
        }
    }
}

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
    
    public long count(int coins[],  int sum) {
        // code here.
        int n=coins.length;
        long dp[][] = new long[n][sum+1];
        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        long ans = solve(n-1,coins,sum,dp);
        
        return ans; 
    }
}
