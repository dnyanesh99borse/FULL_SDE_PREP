import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {

            int toFind = target - arr[i];

            if(map.containsKey(toFind)) {

                System.out.println("Indices: " + map.get(toFind) + " " + i);
                break;

            } else {

                map.put(arr[i], i);
            }
        }
    }
}