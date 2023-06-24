import java.util.Scanner;

class Solution {
    public int klengthpref(String[] arr, int n, int k, String str) {
        String ch = "";
        if (k > str.length()) {
            return 0;
        }
        ch = str.substring(0, k);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (k <= arr[i].length()) {
                if (ch.equals(arr[i].substring(0, k))) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings in the array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Enter the string to compare: ");
        String str = sc.next();
        
        Solution sol = new Solution();
        int result = sol.klengthpref(arr, n, k, str);
        
        System.out.println("The result is: " + result);
    }
}
