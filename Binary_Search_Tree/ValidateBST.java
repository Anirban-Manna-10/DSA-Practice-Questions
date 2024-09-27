// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public static boolean isValid(TreeNode root, TreeNode min, TreeNode max) {
        // If we've reached a null node, it's a valid subtree
        if (root == null) {
            return true;
        }
        // If the current node's value violates the BST property with respect to the min or max, return false
        if (min != null && root.val <= min.val) {
            return false;
        }
        if (max != null && root.val >= max.val) {
            return false;
        }

        // Recursively check the left subtree and the right subtree
        // The left subtree must be less than the current node, and the right subtree must be greater
        return (isValid(root.left, min, root) && isValid(root.right, root, max));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);

        // Manually insert values into the binary tree
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.right = new TreeNode(35);
        
        boolean result = isValid(root, null, null);
        System.out.println("Is the tree a valid BST? " + result);
    }
}
