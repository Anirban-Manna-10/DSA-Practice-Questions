// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class SearchNode{
    // Method to search for a value in a Binary Search Tree (BST)
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (val == root.val) return root;
        
        // If value is greater, search in the right subtree
        if (val > root.val) {
            return searchBST(root.right, val);
        } else {
            // If value is smaller, search in the left subtree
            return searchBST(root.left, val);
        }
    }

    // Helper method to insert nodes into the BST for testing purposes
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

    // Method to display the tree (in-order traversal) for testing
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    // Main method to test the searchBST functionality
    public static void main(String[] args) {
        SearchNode solution = new SearchNode();
        
        // Creating a sample BST
        TreeNode root = null;
        int[] value = {4, 2, 7, 1, 3};
        for(int i : value){
            root = solution.insertIntoBST(root, i);
        }

        // Display the BST
        System.out.println("In-order Traversal of the BST:");
        solution.inOrderTraversal(root);
        System.out.println();

        // Searching for a node in the BST
        int searchValue = 2;
        TreeNode result = solution.searchBST(root, searchValue);
        
        if (result != null) {
            System.out.println("Node with value " + searchValue + " found in the BST.");
        } else {
            System.out.println("Node with value " + searchValue + " not found in the BST.");
        }
    }
}

/*
    OUTPUT
    In-order Traversal of the BST:
    1 2 3 4 7 
    Node with value 2 found in the BST.



*/
