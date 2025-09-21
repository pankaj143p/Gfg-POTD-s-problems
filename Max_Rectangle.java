class Solution {
  public:
    int maxArea(vector<vector<int>> &mat) {
        // code here
        int n=mat.size();
        int m=mat[0].size();
        int ans = 0;
        for(int i = 1;i < n;i++) 
            for(int j = 0;j < m;j++)
                if(mat[i][j]) mat[i][j] += mat[i-1][j];
        for(int i = 0;i < n;i++){
            stack <int> stk;
            for(int j=0;j<=m;j++){
                while(!stk.empty() && (j == m || mat[i][stk.top()] > mat[i][j])){
                    int tp = stk.top();
                    stk.pop();
                    ans = max(ans,
                            mat[i][tp]*(stk.empty()?j:(j-stk.top()-1)));
                }
                stk.push(j);
            }
        }
        return ans;
    }
};
