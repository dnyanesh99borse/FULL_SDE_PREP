public class QueueusingLinkedList{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        //empty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        //is full no needed here cause there's no concern of fixed size in LL

        //add
        public static void add(int data){
            Node newNode = new Node(data);
            //adding for 1st
            if(head == null){
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }
        //REMOVE
        public static int remove(){
            //isempty
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data;
            //remove head
            //single element
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            //isEmpty
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.remove()); //10 removed
        System.out.println(q.peek()); //20 as it is now front
    }
}