public class PrintInRange{
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

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2); //first print left
            System.out.print(root.data + " "); //then root
            printInRange(root.right, k1, k2); /*then right but since there may be 
                                              more nodes in left and right hence  we are using recursive calls there*/
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args){
        int[] values = {8,5,10,3,6,11,14,1,4};
        Node root = null;
        //root will always same still why we do not write it only once 
        //cause initially it is also neccessary that it should be null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        int k1 = 5; int k2 = 12;
        printInRange(root, k1, k2);
        System.out.println();
    }
}