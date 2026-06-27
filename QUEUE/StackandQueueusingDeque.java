import java.util.*;
public class StackandQueueusingDeque{
    //-------------QUEUE--------------------
    static class Queue{
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty(){
            return deque.isEmpty();
        }
        //add in queue
        public static void add(int data){
            deque.addLast(data);
        }
        //remove from queue
        public static int remove(){
            return deque.removeFirst();
        }
        //peek element 
        public static int peek(){
            return deque.getFirst();
        }
    }
    //-------------STACK--------------------
    static class Stack{
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty(){
            return deque.isEmpty();
        }
        //add in stack
        public static void push(int data){
            deque.addLast(data);
        }
        //remove from stack
        public static int pop(){
            return deque.removeLast();
        }
        //peek element 
        public static int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isEmpty()){
            System.out.println(s.peek() + " ");
            s.pop();
            // System.out.println("removed: " + s.pop());
        }


        // Queue q = new Queue();

        // q.add(10);
        // q.add(20);
        // q.add(30);

        // while(!q.isEmpty()){
        //     System.out.println(q.peek() + " ");
        //     q.remove();
        //     // System.out.println("removed: " + q.remove());
        // }
    }
}