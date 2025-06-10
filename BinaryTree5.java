class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree5 {
    Node root;

    // Method to count non-leaf nodes
    int countNonLeafNodes(Node node) {
        if (node == null || (node.left == null && node.right == null)) {
            return 0; // Base case: empty tree or leaf node
        }
        // Recursive step:
        // 1. Count non-leaf nodes in the left subtree.
        // 2. Count non-leaf nodes in the right subtree.
        // 3. Add 1 for the current node (as it is a non-leaf node).
        return 1 + countNonLeafNodes(node.left) + countNonLeafNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Count and print the number of non-leaf nodes
        int nonLeafCount = tree.countNonLeafNodes(tree.root);
        System.out.println("Number of non-leaf nodes: " + nonLeafCount);
    }
}