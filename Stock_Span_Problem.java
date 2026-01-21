class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            int ele=arr[i];
            while(!st.isEmpty() && ele>=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.add(i-st.peek());
            }else{
                ans.add(i+1);
            }
            st.push(i);
        }
        return ans;
    }
}
