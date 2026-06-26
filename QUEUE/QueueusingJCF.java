import java.util.*;
public class QueueusingJCF{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);
        System.out.println("removed element: " + q.remove()); //first element will removed: 10 FIFO
    }
}