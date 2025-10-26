class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(int[] arr) {
        // code here
        // Arrays.sort(arr);
         if(arr==null||arr.length==0){
            return 0;
        }
        long ans=0,temp=0,cnt=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long k : arr){
            pq.add(k);
        }
        while(pq.size()>1){
            // if(!pq.isEmpty()){
            long t1=pq.peek();
            pq.remove();
            long t2=pq.peek();
            pq.remove();
            cnt=t1+t2;
            ans+=cnt;
            pq.add(cnt);
            // }
        }
        return ans;
        // 2 3 4 6 = 2+3 = 5+4 = 9 
    }
}
