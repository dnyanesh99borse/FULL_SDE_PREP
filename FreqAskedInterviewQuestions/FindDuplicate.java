
import java.util.*;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            if (set.contains(x)) {
                System.out.println("Duplicate Number: " + x);
                break;
            }

            set.add(x);
        }
    }
}
