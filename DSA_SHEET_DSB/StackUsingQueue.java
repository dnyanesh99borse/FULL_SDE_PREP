import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static Queue<Integer> mainqueue;
    public static Queue<Integer> queue2;
    public static int sizeofstack;

    public StackUsingQueue() {
        mainqueue = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        mainqueue.offer(x);
        sizeofstack++;
    }

    public int pop() {
//        while(mainqueue.size() != sizeofstack-1){
//            queue2.offer(mainqueue.poll()); //add all elements till the last element of mainqueu into the second queue
//        }
        return mainqueue.poll();
    }

    public int top() {
        return mainqueue.peek();
    }

    public boolean empty() {
        return mainqueue.isEmpty();
    }

    public void movement(){

    }

    public static void main(String[] args){
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); //push

        System.out.println(stack.pop()); //pop

        System.out.println(stack.top()); //top

        System.out.println(stack.empty()); //isEmpty

        System.out.println("Size of stack is: " + sizeofstack);

        System.out.println("size of mainqueue: " + mainqueue.size());
    }
}
