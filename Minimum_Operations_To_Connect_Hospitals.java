class Solution {
    public int minConnect(int V, int[][] edges) {
        int[] parent = new int[V];
        int[] rank = new int[V];
        
        for (int i = 0; i < V; i++) parent[i] = i;

        int extra = 0;

        for (int[] e : edges) {
            int u = e[0], v = e[1];
            if (!union(u, v, parent, rank)) extra++;
        }

        int components = 0;
        for (int i = 0; i < V; i++) {
            if (find(i, parent) == i) components++;
        }

        int req = components - 1;

        if (extra >= req) return req;
        return -1;
    }

    private int find(int x, int[] parent) {
        if (parent[x] != x) parent[x] = find(parent[x], parent);
        return parent[x];
    }

    private boolean union(int a, int b, int[] parent, int[] rank) {
        int pa = find(a, parent);
        int pb = find(b, parent);

        if (pa == pb) return false;

        if (rank[pa] < rank[pb]) parent[pa] = pb;
        else if (rank[pb] < rank[pa]) parent[pb] = pa;
        else {
            parent[pb] = pa;
            rank[pa]++;
        }

        return true;
    }
}

