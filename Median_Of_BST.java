class Solution {
    private int n = 0;
    private int result = -1;
    private int idx = 0;
    
    public int findMedian(Node root) {
        getLen(root);
        dfs(root);
        
        return result;
    }
    
    private void dfs(Node root) {
        if(root != null && result == -1) {
            dfs(root.left);
            idx++;
            if(n % 2 == 0) {
                if(idx == n / 2) {
                    result = root.data;
                    return;
                }
            }
            else {
                if(idx == n / 2 + 1) {
                    result = root.data;
                    return;
                }
            }
            dfs(root.right);
        }
    }
    
    private void getLen(Node root) {
        if(root != null) {
            getLen(root.left);
            n++;
            getLen(root.right);
        }
    }
}
