public class MirrorBST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val){
            root.right = insert(root.right, val);
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    //---------------MIRROR BST-------------------------------------
    public static Node mirrorBST(Node root){
        // if(root == null || (root.left == null && root.right == null)){
        //     return root;
        // }

        // if(root.left != null && root.right != null){
        //     Node temp = mirrorBST(root.right);
        //     root.right = mirrorBST(root.left);
        //     root.left = temp;
        // }else if(root.left == null){
        //     root.left = mirrorBST(root.right);
        //     root.right = null; //remove old one
        // }else{
        //     root.right = mirrorBST(root.left);
        //     root.left = null;
        // }

        // return root;

        //------------SIMPLY WE CAN WRITE-----------------------
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }

        Node left = mirrorBST(root.left);
        Node right = mirrorBST(root.right);

        Node temp = left;
        root.left = right;
        root.right = temp;

        return root;
    }
    public static void main(String[] args){
        int[] values = {3,5,6,8,10,11};
        Node root = null;
        //root will always same still why we do not write it only once 
        //cause initially it is also neccessary that it should be null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();


        mirrorBST(root);
        inOrder(root);
        System.out.println();
    }
}