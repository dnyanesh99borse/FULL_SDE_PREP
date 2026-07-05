public class DeleteNode{
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
//--------------------------DELETE--------------------------------
    public static Node delete(Node root, int val){
        //base case
        if(root == null){
            return null;
        }

        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{
            //root.data == val
            //case1: no child
            if(root.left == null && root.right == null){
                return null;
            }
            //case2: one child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return  root.left;
            }
            //both children if not any above cond. mathces means

            Node IS = inOrderSuccessor(root.right); //cause left most node in right subtree.
            root.data = IS.data; //replace with inorder successor value
            root.right = delete(root.right, IS.data); //recursively by checking case delete that right root of IS and update it in right pointer too.
        }

        return root;
    }

    public static Node inOrderSuccessor(Node root){
        //here it is not root.left it is left or right as
        //the passing parameter from above function is root.right.. then its left most we are findidng.
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args){
        int values[] = {1,3,4,5,6,8,10,11,14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        root = delete(root, 1);
        System.out.println();
        inOrder(root);

        root = delete(root, 10);
        System.out.println();
        inOrder(root);
    }
}