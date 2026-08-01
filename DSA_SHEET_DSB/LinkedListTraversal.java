public class LinkedListTraversal {
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static Node head = null;
    static Node tail = null;

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //---------ADD FIRST----------------
    public static void addFirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    //-----------ADD LAST----------------------
    public static void addLast(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode; //add newnode to the last;
    }

    //-----------ADD AT POSITION-------------------
    public static void addOnPosition(int data, int position){
        if(position == 0){
            addFirst(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;

        int index = 0;
        while(index < position-1){
            temp = temp.next;
            index++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void main(String[] args){
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printList(head);

        addFirst(5);
        printList(head);

        addLast(50);
        printList(head);

        addOnPosition(25, 3);
        printList(head);
    }
}
