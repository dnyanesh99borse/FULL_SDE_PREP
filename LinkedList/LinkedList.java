//---------------LINKED LIST----------------

//create one class as a whole linked list
public class LinkedList{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //create two nodes now one as HEAD and one as TAIL
    public static Node head;
    public static Node tail;

    //method to ADDFIRST new NODE (elements) in LL
    public void addFirst(int data){
        //step-1: create new node
        Node newNode = new Node(data);

        //if Linked List is Empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step-2: newNode -> next = head;
        newNode.next = head; //linking

        //step-3: head = newNode
        head = newNode;
    }

    //method to ADDLAST new NODE (elements) in LL
    public void addLast(int data){
        //step-1: create newNode
        Node newNode = new Node(data);

        //if Linked List is null
        if(head == null){
            tail.next = newNode;
            head = tail = newNode;
            return;
        }

        //step-2: point the current tail's next to new node
        tail.next = newNode;

        //step-3: tail = newNode
        tail = newNode;
    }
    public static void main(String[] args){
        LinkedList LL = new LinkedList();
        LL.addFirst(1);
        LL.addFirst(2);

        //addLast
        LL.addLast(3);
        LL.addLast(4);
    }
}