class Solution {
    public void nearlySorted(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) pq.add(arr[i]);

        int i;
        for (i = k; i < n; i++) {
            pq.add(arr[i]);
            arr[i - k] = pq.poll();
        }
        while (!pq.isEmpty()) {
            arr[i - k] = pq.poll();
            i++;
        }
    }
}
