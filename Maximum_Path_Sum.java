class Solution {
    private static int ans;
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        // your code goes here
        ans=-(int)1e4;
        solve(node);
        return ans;
    }
    private static int solve(Node root){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,solve(root.left));
        int r=Math.max(0,solve(root.right));
        ans=Math.max(ans,l+r+root.data);
        return Math.max(l,r)+root.data;
    }
}
