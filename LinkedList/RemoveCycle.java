public class RemoveCycle{
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


    public void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //find meeting point
            if(slow == fast){
                cycle = true;
                break; //no need to move ahead.
            }
        }

        //cycle does not exist
        if(cycle == false){
            return;
        }
        //other wise find meeting point two
        slow = head;
        Node prev = null;
                
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //make it to null
        prev.next = null; //last node
    }
    public static void main(String[] args){
        RemoveCycle rc = new RemoveCycle();

         // Create Linked List
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Create Cycle
        // 1 -> 2 -> 3 -> 4 -> 5
        //           ^         |
        //           |_________|

        n5.next = n3;

        rc.removeCycle();

        // rc.print();

        //note in remvove cycle in competitions the cycle will always be like from any other point rather than the head
        //not the whole cycle will be there.. but as we are creating the linked list above directly connecting head with the last node
        //it is creating full cycle.. thus.. we should have to create a VALID CYCLIC LL first and then apply removeCycle() function.
        // rc.removeCycle();
    }
}