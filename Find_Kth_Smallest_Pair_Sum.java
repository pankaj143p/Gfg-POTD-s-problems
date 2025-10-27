class Solution {
    
    class Pair {
        int sum, i, j;
        Pair(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
    }
    
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        if(n == 0 || m == 0 || k == 0) return ans;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.sum - b.sum);
        
        for(int i = 0; i < Math.min(k, n); i++) {
            pq.add(new Pair(arr1[i] + arr2[0], i, 0));
        }
        
        while(k-- > 0 && !pq.isEmpty()) {
            int currSum = pq.peek().sum;
            int i = pq.peek().i;
            int j = pq.peek().j;
            pq.poll();
            
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr1[i]);
            temp.add(arr2[j]);
            ans.add(temp);
            
            if(j + 1 < m) {
                pq.add(new Pair(arr1[i] + arr2[j + 1], i, j + 1));
            }
        }
        
        return ans;
    }
}

