class Solution {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < rows; i++) {
            int sc = -1,one=0;
            // int lastServerCol = -1;
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && sc==-1) {
                    sc=j;
                    // lastServerCol = j;
                    one++;
                }else if(grid[i][j]==1){
                    grid[i][sc]=-1;
                    grid[i][j]=-1;
                    cnt++;
                    one++;
                }
            }
            if (one > 1) {
                cnt++;
            }
        }
        for (int j = 0; j < cols; j++) {
            int one=0,neg=0;
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] ==1) { 
                    // sc++;
                    one++;
                    // lastServerRow = i;
                }
                if(grid[i][j]==-1){
                    neg++;
                }
            }
            if(one+neg>1)cnt+=one;
        }

        return cnt;
    }
}
