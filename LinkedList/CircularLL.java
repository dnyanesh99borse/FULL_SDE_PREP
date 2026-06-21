// ---------------- CIRCULAR LINKED LIST ----------------

public class CircularLL {

    // Node Class
    static class Node {
        int data;
        Node next;
    }

    // --------------------------------------------------
    // Add first node to an empty Circular Linked List
    // --------------------------------------------------
    static Node addToEmpty(Node last, int data) {

        // If list already exists
        if (last != null) {
            return last;
        }

        // Create new node
        Node newNode = new Node();
        newNode.data = data;

        // Point node to itself
        last = newNode;
        newNode.next = last;

        return last;
    }

    // --------------------------------------------------
    // Add node at the beginning
    // --------------------------------------------------
    static Node addFront(Node last, int data) {

        if (last == null) {
            return addToEmpty(last, data);
        }

        Node newNode = new Node();
        newNode.data = data;

        // New node points to current head
        newNode.next = last.next;

        // Last points to new node
        last.next = newNode;

        return last;
    }

    // --------------------------------------------------
    // Add node at the end
    // --------------------------------------------------
    static Node addEnd(Node last, int data) {

        if (last == null) {
            return addToEmpty(last, data);
        }

        Node newNode = new Node();
        newNode.data = data;

        // Insert after last
        newNode.next = last.next;
        last.next = newNode;

        // Update last
        last = newNode;

        return last;
    }

    // --------------------------------------------------
    // Insert node after a given item
    // --------------------------------------------------
    static Node addAfter(Node last, int data, int item) {

        if (last == null) {
            return null;
        }

        Node p = last.next;

        do {

            if (p.data == item) {

                Node newNode = new Node();
                newNode.data = data;

                newNode.next = p.next;
                p.next = newNode;

                // If inserted after last node
                if (p == last) {
                    last = newNode;
                }

                return last;
            }

            p = p.next;

        } while (p != last.next);

        System.out.println(item + " not present in the list.");

        return last;
    }

    // --------------------------------------------------
    // Delete a node by value
    // --------------------------------------------------
    static Node deleteNode(Node last, int key) {

        // Empty list
        if (last == null) {
            System.out.println("List is Empty");
            return null;
        }

        Node curr = last.next;
        Node prev = last;

        // Single node case
        if (curr == last && curr.data == key) {
            last = null;
            return last;
        }

        // Delete head node
        if (curr.data == key) {
            last.next = curr.next;
            return last;
        }

        // Search for key
        do {

            if (curr.data == key) {

                prev.next = curr.next;

                // If deleting last node
                if (curr == last) {
                    last = prev;
                }

                return last;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != last.next);

        System.out.println(key + " not found.");

        return last;
    }

    // --------------------------------------------------
    // Traverse Circular Linked List
    // --------------------------------------------------
    static void traverse(Node last) {

        if (last == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = last.next; // head

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);

        System.out.println("(back to head)");
    }

    // --------------------------------------------------
    // Main Method
    // --------------------------------------------------
    public static void main(String[] args) {

        Node last = null;

        // Create List
        last = addToEmpty(last, 6);

        last = addEnd(last, 8);

        last = addFront(last, 2);

        last = addAfter(last, 10, 2);

        System.out.println("Original Circular Linked List:");
        traverse(last);

        // Delete node
        last = deleteNode(last, 8);

        System.out.println("\nAfter deleting 8:");
        traverse(last);
    }
}