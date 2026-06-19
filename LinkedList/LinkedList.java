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
    public static int size;

    //method to ADDFIRST new NODE (elements) in LL
    public void addFirst(int data){
        //step-1: create new node
        Node newNode = new Node(data);
        size++;
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

    //ADDLAST new NODE (elements) in LL
    public void addLast(int data){
        //step-1: create newNode
        Node newNode = new Node(data);
        size++;
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

    //ADD IN THE MIDDLE
    public void add(int index, int data){
        Node newNode = new Node(data);
        //if index == 0.. means inserting at first means head should be handled properly.. thus
        if(index == 0){
            addFirst(data);
            return;
        }
        size++;
        //if linkedlist is empty ...
        if(index >0 && head == null){
            System.out.println("Linked list is empty and you can't insert at "+index);
            return;
        }
        Node temp = head;
        int i = 0;
        while(i != index - 1){
            temp = temp.next;
            i++;
        }
        //when  i == index - 1
        newNode.next = temp.next; //point to next node to the index
        temp.next = newNode; //and link previous to newNode inserted.
    }

    //REMOVE FIRST
    public int removeFirst(){
        //size is 0
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //REMOVE LAST
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i = 1; i < size - 1; i++){
            prev = prev.next;
        }
        int val = tail.data; //prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Method to PRINT linkedlist
    //we already have head thus no need to pass parameter
    public void print(){
        //if linkedlist is Empty
        if(head == null){
            System.out.println("Linked List is Empty.");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //ITERATIVE SEARCH
    public int inrSearch(int key){
        Node temp = head;
        int idx = 0;

        if(temp.data == key){
            return idx;
        }
        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        //key not found
        return -1;
    }

    //ITERATIVE SEARCH
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //REVERSE ITERATIVE
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;  //Node curr = head
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //cause now curr became null but the previous was the last node that should be our head.
        head = prev;
    }

    

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        //addFirst
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        //addMiddle
        ll.add(0,10); ll.print();
        ll.add(0,9); ll.print();
        ll.add(2,11); ll.print();
        //addLast
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        //9->10->11->2->1->3->4
        //size = 7
        System.out.println("Size of LL: " + ll.size);

        //REMOVE FIRST
        ll.removeFirst();
        ll.print();
        System.out.println("Size of LL: " + ll.size);

        //REMOVE LAST
        ll.removeLast();
        ll.print();
        System.out.println("Size of LL: " + ll.size);

        //ITERATIVE SEARCH
        // System.out.println(ll.inrSearch(2));
        // System.out.println(ll.inrSearch(50));

        //RECURSIVE SEARCH
        System.out.println(ll.recSearch(2));
        System.out.println(ll.recSearch(50));

        //REVERSE
        ll.print(); 
        ll.reverse();
        ll.print();
    }
}