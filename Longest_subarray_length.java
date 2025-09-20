class Solution {
    public static int longestSubarray(int[] arr) {
        int n = arr.length;
        int res = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? Integer.MAX_VALUE : arr[i];
            while (!st.isEmpty() && arr[st.peek()] < curr) {
                int j = st.pop(); 
                int prevIndex = st.isEmpty() ? -1 : st.peek();
                int len = i - 1 - prevIndex;
                if (arr[j] <= len) {
                    res = Math.max(res, len);
                }
            }
            if (i < n) st.push(i);
        }
        return res;
    }
}

