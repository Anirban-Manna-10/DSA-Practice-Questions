// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { this.val = val; }
}

public class BalancedBinaryTree {

    // Function to check if the binary tree is balanced
    public boolean isBalanced(TreeNode root) {
        // If the tree is empty, it's balanced
        if (root == null) {
            return true;
        }
        // Check if height of tree is not -1 (indicating unbalanced)
        return (height(root) != -1);
    }

    // Calculate the height of the tree and check for balance
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Recursively find the height of left and right subtrees
        int left = height(root.left);
        int right = height(root.right);

        // If any subtree is unbalanced, propagate the -1 upwards
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        // Return the maximum height of the subtrees plus 1 for the current node
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        BalancedBinaryTree solution = new BalancedBinaryTree();

        // Example 1: Balanced binary tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(6);
        
        System.out.println("Is tree 1 balanced? " + solution.isBalanced(root1)); // Expected: true

        // Example 2: Unbalanced binary tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        
        System.out.println("Is tree 2 balanced? " + solution.isBalanced(root2)); // Expected: false
    }
}
