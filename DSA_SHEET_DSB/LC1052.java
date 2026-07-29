public class LC1052 {

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int totalSatisfied = 0;

        // Already satisfied customers
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                totalSatisfied += customers[i];
            }
        }

        // First window: extra customers we can satisfy
        int extra = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        int maxExtra = extra;

        // Sliding window
        for (int i = minutes; i < customers.length; i++) {
            //for simple keep in mind: after the 1st window.
            //we'll only add the next customer if grump[i] == 1
            //and we'll only remove it for the same other wise no need
            //cause they are already 0 and done with their operations then no need of them..
            //and just assume as our window is moving ahead.. by doing the same increasing and shrinking of window while calculating sum of each window.
            // Remove left
            if (grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            // Add right
            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            maxExtra = Math.max(maxExtra, extra);
        }

        return totalSatisfied + maxExtra;
    }

    public static void main(String[] args) {

        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;

        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
}