// public class SubArraySum{
//     public static int subarraySum(int[] arr, int k){
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
            
//             for(int j=i; j<arr.length; j++){
//                 int sum = 0;
//                 for(int m = i; m <= j; m++){
//                     sum += arr[m];
//                 }
//                 if(sum == k){
//                         count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args){
//         int[] arr = {1,1,1};
//         int k = 2;

//         // subarraySum(arr, 2);
//         System.out.println("output: " + subarraySum(arr, 2));
//     }
// }

//----------------------EVEN SHORTER-------------------------
// public class SubArraySum{
//     public static int subarraySum(int[] arr, int k){
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             int sum = 0;
//             for(int j=i; j<arr.length; j++){
//                 sum += arr[j];
//                 if(sum == k){
//                         count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args){
//         int[] arr = {1,1,1};
//         int k = 2;

//         // subarraySum(arr, 2);
//         System.out.println("output: " + subarraySum(arr, 2));
//     }
// }


//------------------OPTIMAL APPROACH USING PREFIX SUM-----------------------
import java.util.*;
public class SubArraySum{
    public static int subarraySum(int[] nums, int k){
        //Stores: prefix sum -> Frequency
        HashMap<Integer,Integer> map = new HashMap<>();

        //Before starting, prfix sum is 0 and it has occured once
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            //calculate current prefix sum
            sum += nums[i];

            // Step 2: Check if there exists a previous prefix sum
            // such that (currentPrefix - previousPrefix = k)
            //assume currprefix and previousPrefix as the two diff. subarrays for convenience.
            //we are doing like sum(currprefix) - k = x and if x is present in map it means that starting boundary exists it meanst that subarray also exists whos sum is equal to k.

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            //store/update the current prefix sum 
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1};
        int k = 2;

        // subarraySum(arr, 2);
        System.out.println("output: " + subarraySum(nums, 2));
    }
}