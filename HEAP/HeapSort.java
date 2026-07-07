public class HeapSort {

    // Heapify function
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int maxIdx = i;

        // Check left child
        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        // Check right child
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        // If parent is not the largest
        if (maxIdx != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            // Heapify affected subtree
            heapify(arr, maxIdx, size);
        }
    }

    // Heap Sort
    public static void heapSort(int arr[]) {

        // Step 1: Build Max Heap
        int n = arr.length;

        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Step 2: Push largest element to the end
        for (int i = n - 1; i > 0; i--) {

            // Swap first (largest) with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify remaining heap
            heapify(arr, 0, i);
        }
    }

    // Print Array
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 3};

        System.out.println("Original Array:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}