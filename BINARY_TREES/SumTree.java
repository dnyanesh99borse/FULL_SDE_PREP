public class SumTree{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = left;
            right = right;
        }
    }

    public static int transform(Node root){
        if(root == null){
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data; //store current nodes value

        int newleft = root.left == null ? 0 : root.left.data; //handling case for leaf node and other nodes
        int newright = root.right == null ? 0 : root.right.data; //if root.right is null then return 0 else root.right.data

        root.data = newleft + leftChild + newright + rightChild; //update value with left and right tree sum
        
        return data;
    }

    //now to print the elements of the tree.. use preorder
    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        preOrder(root);
    }
}