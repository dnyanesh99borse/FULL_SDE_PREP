//APPROACH 1: 
/*
GET THE INORDER TRAVERSAL OF THE GIVEN TREE AND 
THE MOMENT YOU WILL GET THAT IT IS NOT GETTING SORTED THEN RETURN FALSE(INVALID)
OTHERWISE RETURN TRUE(VALID).
*/

import java.util.*;

public class ValidBST {

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
        } 
        else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        // Duplicate values are ignored

        return root;
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

    // Validate BST
    public static boolean isValidBST(Node root, Node min, Node max) {

        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {

        int values[] = {8, 5, 10, 3, 6, 11, 14, 1, 4};

        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        // root.right.left = new Node(7); //for invalid

        System.out.print("Inorder : ");
        inOrder(root);
        System.out.println();

        if (isValidBST(root, null, null)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Not a Valid BST");
        }
    }
}