public class LinkedListCycleII {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node detectCycle(Node head) {
        if (head == null) {
            return null;
        }

        Node fast = head;
        Node slow = head;

        // Fixed loop condition: must check both fast and fast.next
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                slow = head;
                while (fast != slow) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Start of cycle
            }
        }
        return null; // No cycle
    }

    public static void main(String[] args) {
        LinkedListCycleII list = new LinkedListCycleII();

        // Creating nodes: 10 -> 20 -> 30 -> 40 -> 50
        Node head = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);

        head.next = node20;
        node20.next = node30;
        node30.next = node40;
        node40.next = node50;

        // Creating a cycle: 50 points back to 20
        node50.next = node20;

        // Detect cycle
        Node cycleStart = list.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle begins at node with data: " + cycleStart.data);
        } else {
            System.out.println("No cycle found.");
        }
    }
}