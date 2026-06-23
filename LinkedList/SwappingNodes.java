public class SwappingNodes{
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

    public void swap(int key1, int key2) {

    if (key1 == key2) {
        return;
    }

    Node prev1 = null;
    Node curr1 = head;

    while (curr1 != null && curr1.data != key1) {
        prev1 = curr1;
        curr1 = curr1.next;
    }

    Node prev2 = null;
    Node curr2 = head;

    while (curr2 != null && curr2.data != key2) {
        prev2 = curr2;
        curr2 = curr2.next;
    }

    // key not found
    if (curr1 == null || curr2 == null) {
        return;
    }

    // connect previous nodes
    if (prev1 != null) {
        prev1.next = curr2;
    } else {
        head = curr2;
    }

    if (prev2 != null) {
        prev2.next = curr1;
    } else {
        head = curr1;
    }

    // swap next pointers
    Node temp = curr1.next;
    curr1.next = curr2.next;
    curr2.next = temp;
}

    public static void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args){
        SwappingNodes sn = new SwappingNodes();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        sn.printLL();

        sn.swap(2,4);
        printLL();
        // head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(6);
        // head.next.next.next.next.next.next = new Node(7);
        // head.next.next.next.next.next.next.next = new Node(8);
    }
}