
import java.util.*;

public class LongestConsecutiveSeq {

    public static void main(String[] args) {

        int[] arr = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};

        HashSet<Integer> set = new HashSet<>();

        // Add all elements
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int longest = 0;

        for (int x : set) {

            if (!set.contains(x - 1)) {

                int current = x; //means this element is the only starting point
                int count = 1;

                //then check for next consecutive elements till they are present in the set.
                //and simultaneously count their lenght
                //simultaneously compare and check 
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest Consecutive Sequence Length: " + longest);
    }
}
