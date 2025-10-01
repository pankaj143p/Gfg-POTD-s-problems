import java.util.*;

class Solution {
    private static void backtrack(int[] nums, int start, HashSet<ArrayList<Integer>> results) {
        if (start == nums.length) {
            ArrayList<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            results.add(permutation);
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(nums, start, i);
                backtrack(nums, start + 1, results);
                swap(nums, start, i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        backtrack(arr, 0, hs);

        // Convert HashSet to ArrayList
        ArrayList<ArrayList<Integer>> results = new ArrayList<>(hs);

        // Optional: sort lexicographically
        results.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        return results;
    }
}
