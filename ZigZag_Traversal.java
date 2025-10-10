/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean flag=true;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> lev = new ArrayList<Integer>();
            for(int i=0; i<n; i++){
                Node node = q.poll();
                lev.add(node.data);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            if(!flag) Collections.reverse(lev);
            ans.addAll(lev);
            flag=!flag;
        }
        return ans;
    }
}
