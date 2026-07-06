public class AVLTrees {

    static class Node {
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    // ---------------- HEIGHT ----------------
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    // ---------------- BALANCE FACTOR ----------------
    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    // ---------------- RIGHT ROTATION ----------------
    public static Node rightRotate(Node y) {

        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        // Return new root
        return x;
    }

    // ---------------- LEFT ROTATION ----------------
    public static Node leftRotate(Node x) {

        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        // Return new root
        return y;
    }

    // ---------------- INSERT ----------------
    public static Node insert(Node root, int key) {

        // Normal BST insertion
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root; // Duplicate keys not allowed
        }

        // Update height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Get balance factor
        int bf = getBalance(root);

        // -------- Left Left (LL) --------
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // -------- Right Right (RR) --------
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // -------- Left Right (LR) --------
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // -------- Right Left (RL) --------
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // ---------------- PREORDER ----------------
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // ---------------- INORDER ----------------
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        System.out.print("Preorder Traversal: ");
        preOrder(root);

        System.out.println();

        System.out.print("Inorder Traversal : ");
        inOrder(root);
    }
}