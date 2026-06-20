
import java.util.LinkedList;
//import java.util.*;
public class LinkedListCollec{
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();

        //ADD LAST
        ll.addFirst(1);
        ll.addFirst(2);
        //ADD LAST
        ll.addLast(3);
        ll.addLast(4);

        //PRINT
        System.out.println("Linked list is: " + ll);
        
        //REMOVE LAST AND FIRST
        ll.removeLast();
        ll.removeFirst();

        //PRINT
        System.out.println("Linked list is: " + ll);
    }
}