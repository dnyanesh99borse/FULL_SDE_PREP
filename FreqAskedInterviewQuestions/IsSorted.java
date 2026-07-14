public class IsSorted {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 44, 5, 6};
        
        System.out.println(isArraySorted(arr)); // Prints false
    }

    // Optimal method to check if an array is sorted in ascending order
    public static boolean isArraySorted(int[] arr) {
        // An empty array or an array with 1 element is always sorted
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Instant exit the moment an anomaly is found
            }
        }
        
        return true; // If the loop finishes without returning false, it's sorted
    }
}