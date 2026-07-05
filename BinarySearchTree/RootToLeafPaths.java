import java.util.*;
public class RootToLeafPaths{
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

    public static void printPath(ArrayList<Integer> path){
        for(int x: path){
            System.out.print(x + "-->");
        }
        System.out.println("null");
    }
    //----------------ROOT TO LEAF PATHS----------------------------------
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        //base case
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path); //print list when reach to last node each time.
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);

        path.remove(path.size()-1); //last element
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


        printRoot2Leaf(root, new ArrayList<>());
    }
}