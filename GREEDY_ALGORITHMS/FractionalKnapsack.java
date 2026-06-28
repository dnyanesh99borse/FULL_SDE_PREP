import java.util.*;

public class FractionalKnapsack {

    public static void main(String[] args) {

        // Standard Example
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};

        int W = 50;

        // ratio[][0] = index
        // ratio[][1] = value/weight
        double[][] ratio = new double[values.length][2];

        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double) weights[i];
        }

        // Sort according to ratio (ascending)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        double finalValue = 0;

        // Traverse from highest ratio
        for (int i = ratio.length - 1; i >= 0; i--) {

            int idx = (int) ratio[i][0];

            if (capacity >= weights[idx]) {

                // Take the complete item
                finalValue += values[idx];
                capacity -= weights[idx];

            } else {

                // Take the fractional part
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Maximum Value = " + finalValue);
    }
}
