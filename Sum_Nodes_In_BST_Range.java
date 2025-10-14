/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    private int sumOfNode(Node root, int l, int r){
        if(root==null)return 0;
        int sum=0;
        int val=root.data;
        if(val>=l && val<=r){
            sum=sum+val;
        }
        sum+=sumOfNode(root.left, l, r);
        sum+=sumOfNode(root.right, l, r);
        return sum;
    }
    public int nodeSum(Node root, int l, int r) {
        // code here
        return sumOfNode(root, l, r);
        
    }
}
