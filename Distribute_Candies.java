

//User function Template for Java

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/


class Solution
{
    static int totalMoves;

    public static int distCandy(Node root) {
        totalMoves = 0;
        distribute(root);
        return totalMoves;
    }

    private static int distribute(Node node) {
        if (node == null) {
            return 0;
        }
        // Post-order traversal: first deal with left and right children
        int left = distribute(node.left);
        int right = distribute(node.right);

        // Calculate total moves
        totalMoves += Math.abs(left) + Math.abs(right);

        // Return excess or deficit of candies to parent
        return node.data - 1 + left + right;
    }
}
