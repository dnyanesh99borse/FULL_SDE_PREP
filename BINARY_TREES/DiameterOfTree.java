public class DiameterOfTree{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // public static int Diameter(Node root){
    //     //base case;
    //     if(root == null){
    //         return 0;
    //     }

    //     //kaam
    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     int ldiam = Diameter(root.left);
    //     int rdiam = Diameter(root.right);
    //     int selfdiam = lh + rh + 1;
        
    //     // int max = Math.max(ldiam, rdiam);

    //     return Math.max(selfdiam, Math.max(ldiam, rdiam));
    // }

    //-----------------OPTIMAL APPROACH--------------------------
    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info Diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args){
        // Preorder Representation
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("Diameter of Tree = " + Diameter(root).diam);
    }
}