class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        int n = arr.length;
        int mx = 0;
        int st=-1, ed=-1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0, j=0; j<n; j++){
            while(!minDeque.isEmpty() && arr[minDeque.peekLast()]>=arr[j])minDeque.pollLast();
            minDeque.addLast(j);
            while(!maxDeque.isEmpty() && arr[maxDeque.peekLast()]<=arr[j])maxDeque.pollLast();
            maxDeque.addLast(j);
            while(arr[maxDeque.peekFirst()]-arr[minDeque.peekFirst()]>x){
                i=i+1;
                if(minDeque.peekFirst()<i){
                    minDeque.pollFirst();
                }
                if(maxDeque.peekFirst()<i){
                    maxDeque.pollFirst();
                }
            }
            if(mx<j-i+1){
                mx=j-i+1;
                st=i;
                ed=j;
            }
        }
        for(int itr = st; itr<=ed; itr++){
            ans.add(arr[itr]);
        }
        
        return ans;
    }
}
