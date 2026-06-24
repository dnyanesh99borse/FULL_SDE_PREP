// Idea
// Create an Even List and an Odd List.
// Traverse the original list once.
// Attach each node to either the even list or odd list.
// Finally connect the even list to the odd list.

public class EvenOdd {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail; 

    // Add node at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Optimal O(n) solution
    public void evenOdd() {

        if (head == null || head.next == null) {
            return;
        }

        Node evenHead = null;
        Node evenTail = null;

        Node oddHead = null;
        Node oddTail = null;

        Node curr = head;

        while (curr != null) {

            Node nextNode = curr.next; // save next node
            curr.next = null;          // disconnect current node

            // Even node
            if (curr.data % 2 == 0) {

                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }
            // Odd node
            else {

                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }

            curr = nextNode;
        }

        // Case 1 : No even nodes
        if (evenHead == null) {
            head = oddHead;
            return;
        }

        // Case 2 : No odd nodes
        if (oddHead == null) {
            head = evenHead;
            return;
        }

        // Connect even list with odd list
        evenTail.next = oddHead;

        head = evenHead;
    }

    // Print Linked List
    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        EvenOdd ll = new EvenOdd();

        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);

        System.out.println("Original List:");
        ll.printList();

        ll.evenOdd();

        System.out.println("\nModified List:");
        ll.printList();
    }
}