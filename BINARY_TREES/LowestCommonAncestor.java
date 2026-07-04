import java.util.*;

public class LowestCommonAncestor {

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

    // Stores the path from root to the given node
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {

        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    // Finds Lowest Common Ancestor
    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;

        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
            i++;
        }

        return path1.get(i - 1);
    }

    //--------------APPROACH TWO-----------------------------
    public static Node lca2(Node root, int n1, int n2){
        //base case
        // if(root == null){
        //     return root;
        // } we can directly write this also below combinely

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        //if both n1 n2 lies in right subtree of root
        if(leftlca == null){
            return rightlca;
        }
        //if both n1 n2 lies in left subtree of ro
        if(rightlca == null){
            return leftlca;
        }

        //if no subtree is null means root is the lca
        return root;
    }

    public static void main(String[] args) {

        /*
                    1
                  /   \
                 2     3
                / \   / \
               4   5 6   7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node ans = lca2(root, 4, 5);
        System.out.println("LCA of 4 and 5 = " + ans.data);

        ans = lca2(root, 4, 6);
        System.out.println("LCA of 4 and 6 = " + ans.data);

    }
}