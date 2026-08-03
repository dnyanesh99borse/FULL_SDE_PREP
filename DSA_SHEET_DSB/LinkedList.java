public class LinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node head = null;

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void addFirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public static void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public static void addOnPosition(int data, int position) {
        if (position == 0) {
            addFirst(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;

        int index = 0;
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static void delByPosition(int position) {
        if (head == null) return;

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    public static void delbyValue(int value) {
        if (head == null) return;

        if (value == head.val) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.val != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    //-------------------REVERSE A LINKED LIST-------------------
    public static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; //Why Return prev? at the end The last node processed becomes prev .. which is the new head;

        //--------------RECURSIVE APPROACH-----------------

//        if(head == null || head.next == null){
//            return head;
//        }
//
//        Node newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
    }

    //--------------------DETECT CYCLE -----------------------

        public static boolean hasCycle(Node head) {

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){

                slow = slow.next;

                fast = fast.next.next;

                if(slow == fast){
                    return true;
                }
            }

            return false;
        }


    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printList(head); // 10-->20-->30-->40-->null

        addFirst(5);
        printList(head); // 5-->10-->20-->30-->40-->null

        addLast(50);
        printList(head); // 5-->10-->20-->30-->40-->null-->50

        addOnPosition(25, 3);
        printList(head); // 5-->10-->20-->25-->30-->40-->50-->null

        delByPosition(3);
        printList(head); // 5-->10-->20-->30-->40-->50-->null

        delbyValue(40);
        printList(head); // 5-->10-->20-->30-->50-->null

        head = reverseList(head);
        printList(head);

        System.out.println(hasCycle(head));

    }
}