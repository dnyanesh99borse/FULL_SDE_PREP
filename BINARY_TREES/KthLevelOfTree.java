import java.util.*;
public class KthLevelOfTree{
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

    static class BinaryTree{
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

    public static void kLevel(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int track = 1; int key = 3;

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                track++; //getting null means level change
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
                //if key found then till next null print all elements.
                if(track == key){
                    Node curr = q.remove();
                    while(curr != null){
                        System.out.print(curr.data + " ");
                        curr = q.remove();
                    }
                    break;
                }
                
            }else{
                if(currNode.left != null){
                    q.add(currNode.left); //add left node of curr into queue
                }

                if(currNode.right != null){
                    q.add(currNode.right); //add right node of curr into queue
                }
            }
        }
    }

    public static void main(String[] args){
        int nodes[] = {
            1, 2, 4, -1, -1, 5, -1, -1,
            3, -1, 6, -1, -1
        };

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        kLevel(root);
    }
}