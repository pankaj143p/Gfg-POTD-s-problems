//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}


class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int n=str.length();
        int dp[][]=new int[n+1][n+1];
        // Arrays.fill(dp,0);
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(str.charAt(i-1)==str.charAt(j-1)&&i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
