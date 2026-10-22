import java.util.*;
public class QueueUsingStack {
    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public QueueUsingStack() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public boolean empty(){
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    public void push(int x){
        inputStack.push(x);
    }

    public int pop(){
        moveElements();
        return outputStack.pop();
    }

    public int peek(){
        moveElements();

        return outputStack.peek();
    }

    private void moveElements(){
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
    }

    public static void main(String[] args){
        QueueUsingStack queue = new QueueUsingStack();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);

        System.out.println(queue.pop());
    }
}
