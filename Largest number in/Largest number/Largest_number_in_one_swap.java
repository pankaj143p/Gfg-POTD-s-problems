class Solution {
    public String largestSwap(String s) {
            char[] arr = s.toCharArray();
        char maxDigit = '0';
        int maxIndx = -1, l = -1, r = -1;

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            
            // Update maxDigit if current digit is larger
            if (arr[i] > maxDigit) {
                maxDigit = arr[i];
                maxIndx = i;
            }
            // Found a smaller digit before a larger one
            else if (arr[i] < maxDigit) {
                l = i;
                r = maxIndx;
            }
        }

        // If no swap needed, return original
        if (l == -1) return s;

        // Perform swap
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return new String(arr);
    }
}
