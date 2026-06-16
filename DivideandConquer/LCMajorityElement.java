
//-------------BRUTE FORCE APPROACH---------------------------
// public class LCMajorityElement{
//     public static int majorityElement(int[] arr){
//         int n = arr.length;
//         int limit = n / 2;

//         for(int i = 0; i < arr.length; i++){
//             int count = 0;
//             for(int j = i; j < arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count > limit){
//                     return arr[i];
//             }
//         }
//         return 0;
//         // List<Integer> list = new ArrayList<>();
        
//     }
//     public static void main(String[] args){
//         int[] arr = {2,2,1,1,1,2,2};
//         System.out.println(majorityElement(arr));
//     }
// }


//----------------------------------MOORE BOYER'S ALGORITHM-----------------------------------

// public class LCMajorityElement{
//     public static int majorityElement(int[] arr){
//         int candidate = 0;
//         int count = 0;

//         for(int num : arr){
//             if(count == 0){
//                 candidate = num;
//             }

//             if(num == candidate){
//                 count++;
//             }else{
//                 count--;
//             }
//         }
//         return candidate;
//     }
//     public static void main(String[] args){
//         int[] arr = {2,2,1,1,1,2,2};
//         System.out.println(majorityElement(arr));
//     }
// }

//---------------------------- DIVIDE AND CONQUER -----------------------------------------
public class LCMajorityElement {

    public static int countInRange(int[] arr, int num, int si, int ei) {
        int count = 0;

        for (int i = si; i <= ei; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        return count;
    }

    public static int divideAndConquer(int[] arr, int si, int ei) {

        // Base Case
        if (si == ei) {
            return arr[si];
        }

        int mid = si + (ei - si) / 2;

        // Get majority candidate from left half
        int left = divideAndConquer(arr, si, mid);

        // Get majority candidate from right half
        int right = divideAndConquer(arr, mid + 1, ei);

        // If both halves agree
        if (left == right) {
            return left;
        }

        // Count occurrences of both candidates
        int leftCount = countInRange(arr, left, si, ei);
        int rightCount = countInRange(arr, right, si, ei);

        // Return the stronger candidate
        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int[] arr) {
        return divideAndConquer(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(arr));
    }
}