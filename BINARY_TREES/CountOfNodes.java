public class CountOfNodes{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    public static int Count(Node root){
        if(root == null){
            return 0;
        }

        int lc = Count(root.left);
        int rc = Count(root.right);

        int count = (lc + rc) + 1;

        return count;
    }
    public static void main(String[] main){
        // Preorder Representation
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("Count of Nodes = " + Count(root));
    }
}