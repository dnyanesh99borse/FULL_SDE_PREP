// public class MaxSubArraySumIII{
//     public static void KadanesAlgo(int[] arr){
//         //starting with -infinity.
//         int maxsum = Integer.MIN_VALUE;
//         int currsum = 0;

//         for(int i = 0; i < arr.length; i++){
//             currsum += arr[i];
//             if(currsum < 0){
//                 currsum = 0;
//             }
//             maxsum = Math.max(maxsum , currsum);
//         }
//         System.out.println(maxsum);
//     }
//     public static void main(String[] args){
//         int[] arr = {2,4,6,8};
//         KadanesAlgo(arr);
//     }
// }
//-------------BUT THIS ABOVE CODE WILL FAIL AT HANDLING THE CASE WHERE THERE WILL ALL THE NEGATIVE VALUES IN THE ARRAY--------
public class MaxSubArraySumIII {

    public static void KadanesAlgo(int[] arr) {

        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currSum = Math.max(arr[i], currSum + arr[i]);

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        // int[] arr = {-2, -4, -6, -8};
        int[] arr = {-2, 40, 6, -8};
        KadanesAlgo(arr);
    }
}
