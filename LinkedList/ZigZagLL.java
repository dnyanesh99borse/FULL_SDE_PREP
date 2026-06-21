public class ZigZagLL{
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
    //------------------ZIG-ZAG----------------------
    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null; //break in two halfs 
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next; //move to next
            curr.next = prev; //link with the node behind
            prev = curr; //now update prev
            curr = next; //update or move curr
        }

        Node left = head;
        Node right = prev; //that means head of 2nd half or reverse: null<-1<-2<-3 like here 3.
        Node nextL, nextR;

        //Alternate merging
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL; //or left.next
            //update
            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args){
        ZigZagLL ll = new ZigZagLL();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Before zig zag: ");
        ll.print();
        System.out.println("After zig zag: ");
        ll.zigzag();
        ll.print();
    }
}