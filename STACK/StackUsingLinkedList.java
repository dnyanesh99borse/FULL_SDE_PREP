public class StackUsingLinkedList{
    //------------NODE CLASS---------------------
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //------------STACK CLASS--------------------
    static class Stack{
        public static Node head = null;
        //isEmpty
        public static boolean isEmpty(){
            return head == null;
        }
        
        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            //create new node with this data and make it as head of LL
            newNode.next = head;
            head = newNode;
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            //remove 1st node and make head to next Node
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        //print and delete all the elements of the stack;
        while(!s.isEmpty()){
            System.out.println(s.peek()); //print element
            s.pop(); //pop/remove element
        }
    }
}