
public class SortedArrayToBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // Inorder Traversal
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // -------- SORTED ARRAY TO BALANCED BST --------
    public static Node makeBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        // Left subtree
        root.left = makeBST(arr, start, mid - 1);

        // Right subtree
        root.right = makeBST(arr, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {

        // Array MUST be sorted
        int[] arr = {3, 5, 6, 8, 10, 11, 12};

        Node root = makeBST(arr, 0, arr.length - 1);

        System.out.print("Inorder : ");
        inOrder(root);
    }
}