//this is function of solution
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean []visited=new boolean[V];
        ArrayList<Integer>ans=new ArrayList<Integer>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                 dfs(i,adj,visited,ans);
            }
        }
        return ans;
    }
    
    public static void dfs(int V, ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer>ans){
        visited[V]=true;
        ans.add(V);
        for(Integer nev:adj.get(V)){
            if(!visited[nev]){
                dfs(nev,adj,visited,ans);
            }
        }
    }
}
