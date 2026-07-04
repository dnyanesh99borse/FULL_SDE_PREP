public class Search{
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
    //-----to print the tree----------
    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    //----------------SEARCH----------------------
    public static boolean isFound(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return isFound(root.left, key);
        }

        if(root.data < key){
            return isFound(root.right, key);
        }

        return false;
    }
    public static void main(String[] args){
        int[] values = {8,5,3,6,1,4,10,11,14};

        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        //here root = first node = 8;
        int key = 5;
        System.out.println(isFound(root, key));
    }
}