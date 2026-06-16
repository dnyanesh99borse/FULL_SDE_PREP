//APPROACH WE CAN USE: 1.merge sort 2.quick sort 3.heap sort

//--------------------MERGE SORT APPROACH---------------------------
public class LC912 {

    public static int[] sortArray(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

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

        // Number of elements = end - start + 1
        int[] temp = new int[end - start + 1];

        int i = start;      // Left iterator
        int j = mid + 1;    // Right iterator
        int k = 0;          // Temp iterator

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

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
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 1};

        sortArray(arr);

        printArr(arr);
    }
}