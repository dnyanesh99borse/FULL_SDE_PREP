import java.util.*;
public class QueueusingTwoStacks{
    static class Queue{
        public static Stack<Integer> s1 = new Stack<>();
        public static Stack<Integer> s2 = new Stack<>();

        //ADD
        public static void add(int data){
            //shift element to stack2
            while(!s1.isEmpty()){
                // int top = s1.pop();
                s2.push(s1.pop());
            }
            //add new element in s1
            s1.push(data);
            //shift elements back to stack1
            while(!s2.isEmpty()){
                // int top = s2.pop();
                s1.push(s2.pop());
            }
        }

        //REMOVE
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }

        //PEEK
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }

        //ISEMPTY
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}