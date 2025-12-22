class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int r = 0;              
        int c = m - 1;        
        int max_row_index = -1; 
        while (r < n && c >= 0) {
            if (arr[r][c] == 1) {
                max_row_index = r;
                c--;
            } else {
                r++;
            }
        }
        return max_row_index;
    }
}
