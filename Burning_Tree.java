class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
   static Map<Integer,List<Integer>> map = new HashMap<>();
    static Node TargetNode = null;
    public static int minTime(Node root, int target) 
    {
        
      //  findtargetNode(root,target);
        constructMap(root,null);
        return calTime(target);
    }
    
    public static int calTime(int target){
        
        int time = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(target);
        visited.add(target);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            
            for(int i=0;i<n;i++){
                int dequeued = queue.poll();
                
                for(int elems : map.get(dequeued)){
                    if(visited.contains(elems)){
                        continue;
                    }
                    queue.add(elems);
                    visited.add(elems);
                }
            }
            time++;
        }
        
        return time-1;
        
    }
    public static void constructMap(Node root,Node parent){
        if(root==null){
            return ;
        }
        else{
            map.put(root.data,new ArrayList<>());
            if(parent!=null){
                map.get(parent.data).add(root.data);
                map.get(root.data).add(parent.data);
            }
            constructMap(root.left,root);
            constructMap(root.right,root);
        }
    }
}
