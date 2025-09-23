class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.add(q.peek());
            q.remove();
        }
        while(!st.isEmpty()){
            q.offer(st.peek());
            st.pop();
        }
    }
}
