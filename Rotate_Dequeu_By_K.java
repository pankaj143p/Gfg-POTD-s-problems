class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        int n=dq.size();
        k=k%n;
        if(type==1){
            while(k-->0){
                int ele = dq.pollLast();
                dq.addFirst(ele);
            }
        }else{
            while(k-->0){
                int ele = dq.pollFirst();
                dq.addLast(ele);
            }
        }
    }
}
