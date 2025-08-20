class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        
        int low=0;
        int high=(n*m)-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            int r=mid/m;
            int c=mid%m;
            int lr=low/m;
            int lc=low%m;
            int hr=high/m;
            int hc=high%m;
            
            if(mat[r][c]==x)return true;
            
            if(mat[lr][lc]<=mat[r][c])
            {
                if(x>=mat[lr][lc] && x<mat[r][c])high=mid-1;
                else low=mid+1;
            }
            else
            {
                if(x>mat[r][c] && x<=mat[hr][hc])low=mid+1;
                else high=mid-1;
            }
            
        }
        return false;
    }
}

