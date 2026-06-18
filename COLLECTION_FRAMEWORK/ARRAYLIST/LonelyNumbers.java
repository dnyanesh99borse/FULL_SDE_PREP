import java.util.*;

public class LonelyNumbers {

    public static List<Integer> lonelyNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {

            int curr = list.get(i);

            boolean leftCheck =
                    (i > 0) &&
                    (list.get(i - 1) == curr ||
                     list.get(i - 1) == curr - 1);

            boolean rightCheck =
                    (i < list.size() - 1) &&
                    (list.get(i + 1) == curr ||
                     list.get(i + 1) == curr + 1);

            if (!leftCheck && !rightCheck) {
                result.add(curr);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 =
                new ArrayList<>(Arrays.asList(10, 6, 5, 8));

        ArrayList<Integer> list2 =
                new ArrayList<>(Arrays.asList(1, 3, 5, 3));

        System.out.println(lonelyNumbers(list1)); // [8, 10]
        System.out.println(lonelyNumbers(list2)); // [1, 5]
    }
}