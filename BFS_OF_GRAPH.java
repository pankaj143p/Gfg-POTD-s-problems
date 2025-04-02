class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n=adj.size();
        Queue<Integer>q = new LinkedList<>();
        boolean vis[] = new boolean[n];
        q.add(0);
        vis[0]=true;
        while(q.size()>0){
            int curr=q.poll();
            ans.add(curr);
            for(int ng : adj.get(curr)){
                if(!vis[ng]){
                    vis[ng]=true;
                    q.offer(ng);
                }
            }
        }
        return ans;
    }
}
