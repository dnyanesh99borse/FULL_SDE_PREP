
import java.util.*;

public class Arraylist1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List: " + list);

        System.out.println("Element at index 1: " + list.get(1));

        list.set(1,100);

        System.out.println("After Update: "  + list);

        list.remove(0); //remove first element

        System.out.println("After Remove: " + list);

        System.out.println("Size: " + list.size());

        System.out.println("Contains 30: " + list.contains(30));

        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}
