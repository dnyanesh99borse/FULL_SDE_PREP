import java.util.*;

public class BSTtoBalancedBST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder Traversal
    public static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }

        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);

        return list;
    }

    // Build Balanced BST from Sorted ArrayList
    public static Node makeBST(ArrayList<Integer> inorderList, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(inorderList.get(mid));

        root.left = makeBST(inorderList, start, mid - 1);
        root.right = makeBST(inorderList, mid + 1, end);

        return root;
    }

    // Convert BST to Balanced BST
    public static Node balancedBST(Node root) {

        ArrayList<Integer> inorderList = new ArrayList<>();
        inOrder(root, inorderList);

        return makeBST(inorderList, 0, inorderList.size() - 1);
    }

    public static void main(String[] args) {

        // Creating an Unbalanced BST
        Node root = null;

        root = insert(root, 8);
        root = insert(root, 6);
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 10);
        root = insert(root, 11);
        root = insert(root, 12);

        Node newRoot = balancedBST(root);

        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(inOrder(newRoot, ans));
    }
}