// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class DeleteNode {
    // Method to delete a node from the BST
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            // Case 1: Leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Node has one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                // Case 3: Node has two children
                root.val = inorderSuccessor(root.right).val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }

    // Helper method to find the inorder successor (smallest node in the right subtree)
    public static TreeNode inorderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Method to insert nodes into the BST for testing
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

    // Method to display the tree (in-order traversal)
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    // Main method for testing the deleteNode function
    public static void main(String[] args) {
        DeleteNode solution = new DeleteNode();

        // Creating a sample BST
        TreeNode root = null;
        int[] value = {5, 3, 6, 2, 4, 7};
        for(int i : value){
            root = solution.insertIntoBST(root, i);
        }

        // Display the BST before deletion
        System.out.println("In-order Traversal of the BST before deletion:");
        solution.inOrderTraversal(root);
        System.out.println();

        // Deleting a node (test case: delete node with key 3)
        int keyToDelete = 3;
        root = deleteNode(root, keyToDelete);

        // Display the BST after deletion
        System.out.println("In-order Traversal of the BST after deleting node " + keyToDelete + ":");
        solution.inOrderTraversal(root);
        System.out.println();
    }
}
