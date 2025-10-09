class Solution {
    private void rec(Node root, ArrayList<Integer>al){
        if(root==null)return ;
        rec(root.left, al);
        rec(root.right, al);
        al.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        rec(root, ans);
        return ans;
    }
}
