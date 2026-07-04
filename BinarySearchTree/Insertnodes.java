// public class Insertnodes{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data = data;
//         }
//     }

//     //as this function will always return root after attaching it on proper place and 
//     //then the curr node is just comparing it and attachign it to it's left or right
//     //cause ultimately its return type is also Node.
//     public static Node insert(Node root, int val){
//         //base 
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }
//         //if val < root insert in left by comparing
//         if(val < root.data){
//             root.left = insert(root.left, val);
//         }
//         //if val > root insert in right by comparing
//         if(val > root.data){
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     //to print it in InOrder
//     public static void Inorder(Node root){
//         //base case
//         if(root == null){
//             return;
//         }

//         Inorder(root.left);
//         System.out.print(root.data + " ");
//         Inorder(root.right);
//     }
//     public static void main(String[] args){
//         int[] values = {5,1,3,4,2,7};
//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         Inorder(root);
//         System.out.println();
//     }
// }


public class Insertnodes{
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

        if(val < root.data){
            root.left = insert(root.left, val);
        }

        if(val > root.data){
            root.right = insert(root.right, val);
        }

        return root;
    }
    //inOrder
    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args){
        int[] values = {1,2,3,4,5,6,7,8,9,10};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]); //each time new updated root value and val is getting passed.
        }

        inOrder(root);
        System.out.println();
    }
}