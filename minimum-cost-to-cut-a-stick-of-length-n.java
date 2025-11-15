class Solution {
private:
    // ---------------- MEMOIZATION ----------------
    int solve(int i, int j, vector<int>& cuts, vector<vector<int>>& dp) {
        if (i > j) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int mini = 1e9;

        for (int ind = i; ind <= j; ind++) {
            int cost = (cuts[j + 1] - cuts[i - 1]) 
                        + solve(i, ind - 1, cuts, dp)
                        + solve(ind + 1, j, cuts, dp);

            mini = min(mini, cost);
        }

        return dp[i][j] = mini;
    }

public:
    int minCutCost(int n, vector<int>& cuts) {

        int c = cuts.size();
        cuts.insert(cuts.begin(), 0);
        cuts.push_back(n);
        sort(cuts.begin(), cuts.end());

        // ---------------- MEMOIZATION ----------------
        // vector<vector<int>> dp(c + 1, vector<int>(c + 1, -1));
        // return solve(1, c, cuts, dp);

        // ---------------- TABULATION ----------------
        vector<vector<int>> dp(c + 2, vector<int>(c + 2, 0));

        for (int i = c; i >= 1; i--) {
            for (int j = 1; j <= c; j++) {

                if (i > j) continue;

                int mini = 1e9;

                for (int ind = i; ind <= j; ind++) {
                    int cost = (cuts[j + 1] - cuts[i - 1]) 
                                + dp[i][ind - 1] 
                                + dp[ind + 1][j];

                    mini = min(mini, cost);
                }

                dp[i][j] = mini;
            }
        }

        return dp[1][c];
    }
};
