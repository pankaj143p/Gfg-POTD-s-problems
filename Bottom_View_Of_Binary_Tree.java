





class Pair{
    Node node;
    int col;
    Pair(Node node, int col){
        this.node=node;
        this.col=col;
    }
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> queue= new LinkedList<>();
        queue.add(new Pair(root,0));
        
        
        while(!queue.isEmpty()){
            Pair curr= queue.remove();
            Node currNode=curr.node;
            int currCol=curr.col;
            
            map.put(currCol,currNode.data);
            
            if(currNode.left!=null){
                queue.add(new Pair(currNode.left,currCol-1));
            }
            
            if(currNode.right!=null){
                queue.add(new Pair(currNode.right,currCol+1));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        
        return list;
    }
}
