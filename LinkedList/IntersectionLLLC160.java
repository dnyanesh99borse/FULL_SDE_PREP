//--------------------TWO POINTERS SWAPPING APPROACH----------------------------
public class IntersectionLLLC160 {

    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to find intersection node
    public static Node intersection(Node head1, Node head2) {

        // Edge case
        if (head1 == null || head2 == null) {
            return null;
        }

        // Create two pointers
        Node p1 = head1;
        Node p2 = head2;

        /*
         * Keep moving until both pointers become equal.
         *
         * Cases:
         * 1. They meet at the intersection node.
         * 2. Both become null (no intersection).
         */
        while (p1 != p2) {

            /*
             * If p1 reaches the end of List1,
             * move it to the head of List2.
             * Otherwise move normally.
             */
            if (p1 == null) {
                p1 = head2;
            } else {
                p1 = p1.next;
            }

            /*
             * If p2 reaches the end of List2,
             * move it to the head of List1.
             * Otherwise move normally.
             */
            if (p2 == null) {
                p2 = head1;
            } else {
                p2 = p2.next;
            }
        }

        /*
         * When loop ends:
         *
         * p1 == p2
         *
         * Either:
         * - Intersection node
         * OR
         * - null (if no intersection exists)
         */
        return p1;
    }

    public static void main(String[] args) {

        /*
                List 1:
                10 -> 15 -> 30

                List 2:
                3 -> 6 -> 9
                          |
                          v
                         15 -> 30

                Intersection = 15
        */

        // Common part
        Node common1 = new Node(15);
        Node common2 = new Node(30);

        common1.next = common2;

        // First Linked List
        Node head1 = new Node(10);
        head1.next = common1;

        // Second Linked List
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);
        head2.next.next.next = common1;

        // Find intersection
        Node ans = intersection(head1, head2);

        if (ans != null) {
            System.out.println("Intersection Node = " + ans.data);
        } else {
            System.out.println("No Intersection Found");
        }
    }
}

//------------LENGTH DIFFERNCE APPROACH---------------------------

// public class IntersectionLLLC160 {

//     static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // ---------- GET LENGTH ----------
//     public static int size(Node head) {
//         int count = 0;

//         while (head != null) {
//             count++;
//             head = head.next;
//         }

//         return count;
//     }

//     // ---------- FIND INTERSECTION ----------
//     public static Node intersection(Node head1, Node head2) {

//         Node temp1 = head1;
//         Node temp2 = head2;

//         // Length of both linked lists
//         int len1 = size(head1);
//         int len2 = size(head2);

//         // Difference
//         int diff = Math.abs(len1 - len2);

//         // Move pointer of longer list ahead by diff nodes
//         if (len1 > len2) {

//             while (diff > 0) {
//                 temp1 = temp1.next;
//                 diff--;
//             }

//         } else {

//             while (diff > 0) {
//                 temp2 = temp2.next;
//                 diff--;
//             }
//         }

//         // Traverse both together
//         while (temp1 != null && temp2 != null) {

//             if (temp1 == temp2) {
//                 return temp1;
//             }

//             temp1 = temp1.next;
//             temp2 = temp2.next;
//         }

//         return null;
//     }

//     public static void main(String[] args) {
//         /*
//                 List 1:
//                 10 -> 15 -> 30

//                 List 2:
//                 3 -> 6 -> 9
//                           |
//                           v
//                          15 -> 30

//                 Intersection = 15
//         */

//         // Common part
//         Node common1 = new Node(15);
//         Node common2 = new Node(30);

//         common1.next = common2;

//         // First Linked List
//         Node head1 = new Node(10);
//         head1.next = common1;

//         // Second Linked List
//         Node head2 = new Node(3);
//         head2.next = new Node(6);
//         head2.next.next = new Node(9);
//         head2.next.next.next = common1;

//         // Find Intersection
//         Node ans = intersection(head1, head2);

//         if (ans != null) {
//             System.out.println("Intersection Node = " + ans.data);
//         } else {
//             System.out.println("No Intersection Found");
//         }
//     }
// }
