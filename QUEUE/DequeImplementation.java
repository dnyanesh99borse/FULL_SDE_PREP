import java.util.*;
public class DequeImplementation{
    public static void main(String[] args){
        Deque<Integer> deque = new LinkedList<>();

        //addfirst
        deque.addFirst(2);
        deque.addFirst(1);
        //addLast
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        //removefirst
        deque.removeFirst();
        //removelast
        deque.removeLast();
        System.out.println(deque);

        //peek
        deque.getFirst();
        deque.getLast();
    }
}