import java.util.*;

public class MonotonicArrayList {

    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                increasing = false;
            }

            if (list.get(i) < list.get(i + 1)) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 4, 4, 5));

        ArrayList<Integer> list2 = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 2, 2, 1));

        ArrayList<Integer> list3 = new ArrayList<>(
                Arrays.asList(1, 2, 4, 3, 4, 3, 7, 5, 8));

        ArrayList<Integer> list4 = new ArrayList<>(
                Arrays.asList(2, 2, 2, 2, 2));

        System.out.println(isMonotonic(list1)); // true
        System.out.println(isMonotonic(list2)); // true
        System.out.println(isMonotonic(list3)); // false
        System.out.println(isMonotonic(list4)); // true
    }
}