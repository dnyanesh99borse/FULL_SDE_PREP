public class SubTreeOrNot {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int[] nodes) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    // Check whether two trees are identical
    public static boolean isIdentical(Node node, Node subroot) {

        if (node == null && subroot == null) {
            return true;
        }

        if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }

        if (!isIdentical(node.left, subroot.left)) {
            return false;
        }

        if (!isIdentical(node.right, subroot.right)) {
            return false;
        }

        return true;
    }

    // Check whether subroot is a subtree of root
    public static boolean isSubtree(Node root, Node subroot) {

        if (root == null) {
            return false;
        }

        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        return isSubtree(root.left, subroot) ||
               isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {

        // Main Tree (Preorder)
        int nodes[] = {
            1, 2, 4, -1, -1, 5, -1, -1,
            3, -1, 6, -1, -1
        };

        // Subtree (Preorder)
        int nodes2[] = {
            2, 4, -1, -1, 5, -1, -1
        };

        // Build Main Tree
        BinaryTree.idx = -1;
        Node root = BinaryTree.BuildTree(nodes);

        // Build Subtree
        BinaryTree.idx = -1;
        Node subroot = BinaryTree.BuildTree(nodes2);

        System.out.println(isSubtree(root, subroot));
    }
}