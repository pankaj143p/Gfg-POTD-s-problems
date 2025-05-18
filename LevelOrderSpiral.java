class Solution
{
    ArrayList<Integer> findSpiral(Node root) 
    {
    ArrayList<Integer> output=new ArrayList<>();
    if(root == null) return output;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int level = 1;
    while(!q.isEmpty()) {
        int size = q.size(), output_start_index = output.size() ;
        for(int i=0; i<size; i++) {
            Node curr = q.poll();
            output.add(curr.data);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        if(level % 2 != 0) 
            Collections.reverse(output.subList(output_start_index, output.size()));
        level++;
    }
    return output;


    }
}
