public class DetectCycle{
    //make it static to directly use inside static main method without creating objects
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //create two nodes now one as HEAD and one as TAIL
    public static Node head;
    public static Node tail;
    // public static int size;

    //----------PRINT-----------------------------
    public void print() {
        //if linkedlist is Empty
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //---------CHECH CYCLIC OR NOT---------------
    public boolean isCyclic(){
        Node slow = head;
        Node fast = head;

        //as long as both are true loop will continue. for both even and odd LL
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //cycle
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        DetectCycle dc = new DetectCycle();

        // dc.addFirst(4);
        // dc.addFirst(3);
        // dc.addFirst(2);
        // dc.addFirst(1);
        
        //directly add elements to linkedlist
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        // head.next.next.next = head;
        //1-2-3-1  ......cyclic

        //if this is cyclic LL then don't print it otherwise it will run forever.
        // dc.print();

        System.out.println(dc.isCyclic());
    }
}