
class Binarysearch {

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        // int[] arr = {10, 20, 30, 40, 50};
        int[] arr = {1,2,3,4,5,10,20,30};
        int target = 10;

        System.out.println(BinarySearch(arr, target));

    }
    
}
