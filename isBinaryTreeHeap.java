class Solution {
    boolean isHeap(Node tree) {
        Queue<Node>q = new LinkedList();
        q.add(tree);
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz--!=0){
                Node node = q.poll();
                if(node==null){
                    while(!q.isEmpty()){
                        if(q.poll()!=null) return false;
                    }
                    break;
                }
                else if((node.left==null && node.right!=null)){
                    return false;
                }
                else{
                    if(!((node.left==null || node.left.data<node.data) && (node.right==null || node.right.data<node.data))) return false;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
        }
        return true;
    }
}
