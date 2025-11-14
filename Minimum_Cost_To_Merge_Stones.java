

//User function Template for Java

class Solution {
    public static int mergeStones(int stones[], int N, int K) {
        if ((N - 1) % (K - 1) != 0)
            return -1; // Not possible to merge all piles

        int[][] dp = new int[N + 1][N + 1];
        int[] prefixSum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + stones[i - 1];
        }

        for (int len = K; len <= N; len++) {
            for (int i = 1; i + len - 1 <= N; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k += K - 1) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j]);
                }

                if ((len - 1) % (K - 1) == 0) {
                    dp[i][j] += prefixSum[j] - prefixSum[i - 1];
                }
            }
        }

        return dp[1][N];
    }
}   
