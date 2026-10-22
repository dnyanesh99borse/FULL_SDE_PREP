public class StackUsingArray {
    int[] stack;
    int top;
    int capacity;

    //constructor
    StackUsingArray(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    //Push: Add an element to the stack
    void push(int value){
        if(top == capacity-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println("Pushed value" + value);
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    //Check whether the stack is empty
    boolean isEmpty(){
        return top == -1;
    }

    //Display all elements
    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: ");

        for(int i = top; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        StackUsingArray s = new StackUsingArray(10);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();
        System.out.println("Top element: " + s.peek());
        System.out.println("Removed element: "+ s.pop());
        s.display();

        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
