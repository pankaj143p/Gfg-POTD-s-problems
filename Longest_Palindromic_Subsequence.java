//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int longestPalinSubseq(String s){

   String rev = new StringBuilder(s).reverse().toString();
        int l=rev.length();
        int dp[][]=new int[n+1][l+1];
        for(int k=1;k<=n;k++){
            for(int j=1;j<=l;j++){
               if(s.charAt(k-1)==rev.charAt(j-1)){
                   dp[k][j]=1+dp[k-1][j-1];
               }
               else{
               dp[k][j]=Math.max(dp[k][j-1],dp[k-1][j]);
            }
            }
        }
        return dp[n][l];
       
}
}
