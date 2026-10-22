public class StackUsingLinkedList {
    //Node class
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    //Push: Insert element at the top
    void push(int val){
        Node newNode = new Node(val);

        newNode.next = top;
        top = newNode;

        System.out.println(val + "Pushed into stack");
    }

    //Pop: Remove element from the top
    int pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        int removed = top.data;
        top = top.next;

        return removed;
    }

    //Peek: Get the top element
    int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    //Check whether stack is empty
    boolean isEmpty(){
        return top == null;
    }

    //Display stack elements
    void display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;

        System.out.print("Stack elements: ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        System.out.println("Top element: " + s.peek());

        System.out.println("Removed element: " + s.pop());

        s.display();

        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
