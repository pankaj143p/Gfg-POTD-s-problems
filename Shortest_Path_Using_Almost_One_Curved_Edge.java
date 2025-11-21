class Pair{
    int node ;
    int straight ;
    int curve ;
    public Pair(int node , int straight , int curve ){
        this.node = node ;
        this.straight = straight ;
        this.curve = curve ; 
    }
}
class Solution {
    public int shortestPath(int V, int a, int b, int[][] edges) {
        PriorityQueue<int[]> p = new PriorityQueue<>((x,y)->{
            return Integer.compare(x[0],y[0]);
        });
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i[] : edges){
            adj.get(i[0]).add(new Pair(i[1],i[2],i[3]));
            adj.get(i[1]).add(new Pair(i[0],i[2],i[3]));
        }
        p.add(new int[]{0,a,0});
        int vis[][] = new int[V][2];
        for(int i[] : vis)
        Arrays.fill(i,Integer.MAX_VALUE);
        vis[a][0] = 0;
        while(!p.isEmpty()){
            int temp[] = p.poll();
            int value = temp[0];
            int vertex = temp[1];
            int flag = temp[2];
            if(vertex==b){
                return value;
            }
            for(Pair pair : adj.get(vertex)){
                int node = pair.node ; 
                int str = pair.straight ;
                int cur = pair.curve ;
                
                if(vis[node][flag]>str+value){
                    p.add(new int[]{str+value,node,flag});
                    vis[node][flag] = str + value;
                }
                    
                if(flag==0 && vis[node][1]>cur+value){
                    p.add(new int[]{cur+value,node,1});
                    vis[node][1] = cur + value ;
                }   
            }
        }
        return -1;
    }
}
