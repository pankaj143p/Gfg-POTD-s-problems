

// User function Template for Java
/*class Node
{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}*/

// import java.util.*;

class Solution {
    // Helper method that returns {include, exclude}
    private int[] solve(Node root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = solve(root.left);
        int[] right = solve(root.right);

        int include = root.data + left[1] + right[1];
        int exclude = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{include, exclude};
    }

    public int getMaxSum(Node root) {
        int[] result = solve(root);
        return Math.max(result[0], result[1]);
    }
}
