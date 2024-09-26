// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class InvertBST {
    // Method to invert a binary tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap the left and right subtrees recursively
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);

        root.left = left;
        root.right = right;

        return root;
    }

    // Alternative approach - commented out
    /*
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }

        // Swap root's left and right
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        // Recursively invert the subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    */

    // Method to insert nodes into the binary tree for testing
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

    // Method for in-order traversal to display the tree
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    // Main method to test the invertTree function
    public static void main(String[] args) {
        InvertBST solution = new InvertBST();

        // Creating a sample binary tree
        TreeNode root = null;
        int[] value = {4, 2, 7, 1, 3, 6, 9};
        for(int i : value){
            root = solution.insertIntoBST(root, i);
        }

        // Display the tree before inversion
        System.out.println("In-order Traversal of the Tree before inversion:");
        solution.inOrderTraversal(root);
        System.out.println();

        // Inverting the tree
        root = solution.invertTree(root);

        // Display the tree after inversion
        System.out.println("In-order Traversal of the Tree after inversion:");
        solution.inOrderTraversal(root);
        System.out.println();
    }
}
