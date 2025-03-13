
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            int capacity = Integer.parseInt(br.readLine());
            String[] valInput = br.readLine().split(" ");
            String[] wtInput = br.readLine().split(" ");

            int[] val = new int[valInput.length];
            int[] wt = new int[wtInput.length];

            for (int i = 0; i < valInput.length; i++) {
                val[i] = Integer.parseInt(valInput[i]);
            }

            for (int i = 0; i < wtInput.length; i++) {
                wt[i] = Integer.parseInt(wtInput[i]);
            }

            System.out.println(Solution.knapsack(capacity, val, wt));
            System.out.println("~");
        }
    }
}

class Solution {
    private static int solve(int W, int val[], int wt[], int n, int dp[][]){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n][W]!=-1)return dp[n][W];
        int non_take,take;
        if(wt[n-1]>W){
            return dp[n][W]=solve(W,val,wt,n-1,dp);
        }
        // else{
            non_take=solve(W,val,wt,n-1,dp);
            take=val[n-1]+solve(W-wt[n-1], val, wt, n-1, dp);
        // }
        return dp[n][W]=Math.max(take, non_take);
    }
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
         int [][]dp=new int[n+1][W+1];
         for(int i=0;i<=n;i++){
             for(int j=0;j<=W;j++){
                 dp[i][j]=-1;
             }
         }
        return solve(W, val, wt, n, dp);
        
    }
}
