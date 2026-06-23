public class DeleteMafterN {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void deleteNAfterM(int m, int n) {

        // If M = 0, delete entire list
        if (m == 0) {
            head = null;
            return;
        }

        Node curr = head;

        while (curr != null) {

            // Keep M nodes
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }

            // Reached end of list
            if (curr == null) {
                break;
            }

            // Start deleting after curr
            Node temp = curr.next;

            // Skip N nodes
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }

            // Connect remaining list
            curr.next = temp;

            // Continue from temp
            curr = temp;
        }
    }

    public void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DeleteMafterN ll = new DeleteMafterN();

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original LL:");
        ll.printLL();

        ll.deleteNAfterM(2, 2);

        System.out.println("\nAfter Deletion:");
        ll.printLL();
    }
}