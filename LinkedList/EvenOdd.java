public class EvenOdd{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void EvenOdd(){
        //make two pointers
        Node evnptr = head;
        Node oddptr = head;
        Node temp = head;

        while(temp != null){
            //if even node found
            if(temp.data % 2 == 0){
                        
            }
        }
    }

    public static void main(String[] args){

    }
}