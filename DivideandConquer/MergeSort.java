public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end) {
        // Base Case
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        // Left Half
        mergeSort(arr, start, mid);

        // Right Half
        mergeSort(arr, mid + 1, end);

        // Merge
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {

        //Whenever you want to know how many elements exist between two indices (inclusive):
        //Number of elements = end - start + 1

        int[] temp = new int[end - start + 1];

        int i = start;      // Left iterator
        int j = mid + 1;    // Right iterator
        int k = 0;          // Temp iterator

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];  //temp[0] = 2   k = 1   j = 3 //first iteration.. it is assinging the values and then incrementing it.
            }
        }

        //Only one of these loops will actually run.
        //Never both. Because one side has already finished.
        
        // Remaining Left Elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining Right Elements
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy Temp -> Original Array
        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {6, 3, 95, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        printArr(arr);
    }
}