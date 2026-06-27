import java.util.*;
public class ReverseQueue{
    public static Queue reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.add(q.remove()); //remove from queue add in stack
        }

        while(!s.isEmpty()){
            q.add(s.pop()); //pop from stack and add in queue
        }

        return q;
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        //add 10 elements in QUEUE
        for(int i = 1; i <= 10; i++){
            q.add(i);
        }

        reverse(q);
        
        System.out.println("Queue after reverse: ");
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}