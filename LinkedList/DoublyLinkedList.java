
public class DoublyLinkedList {

    static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //------------PRINT---------------------
    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //------------ADDFIRST---------------------
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //------------ADDLAST---------------------
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    //------------REMOVEFIRST---------------------
    public void removeFirst(){
        //if LL is empty
        if(head == null){
            System.out.println("Linked List is Empty");
        }
        //if LL has only one node
        if(head.next == null){
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }
    //------------REMOVEFIRST---------------------
    public void removeLast(){
        //if LL is empty
        if(head == null){
            System.out.println("Linked List is Empty");
        }
        //if LL has only one node
        if(head.next == null){
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.addFirst(4); 
        dl.addFirst(5);
        dl.addLast(6);
        dl.addLast(7);
        dl.print(); //5->4->6->7
        dl.removeFirst(); //4->6->7->null
        dl.print();
        dl.removeLast(); //4->6->null //last
        dl.print();
        dl.removeLast(); //4->null //last
        dl.print();
        System.out.println("size : " + dl.size);
    }
}
