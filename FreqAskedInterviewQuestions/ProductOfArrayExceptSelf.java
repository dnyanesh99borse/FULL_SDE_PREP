//-------------------O(N):TIME AND SPACE BOTH-------------------

// public class ProductOfArrayExceptSelf {

//     public static int[] productExceptSelf(int[] nums) {
//         int n = nums.length;

//         int[] left = new int[n];
//         int[] right = new int[n];
//         int[] answer = new int[n];

//         // First element has no left elements
//         left[0] = 1;

//         // Build left array
//         for (int i = 1; i < n; i++) {
//             left[i] = left[i - 1] * nums[i - 1];
//         }

//         // Last element has no right elements
//         right[n - 1] = 1;

//         // Build right array
//         for (int i = n - 2; i >= 0; i--) {
//             right[i] = right[i + 1] * nums[i + 1];
//         }

//         // Multiply left and right products
//         for (int i = 0; i < n; i++) {
//             answer[i] = left[i] * right[i];
//         }

//         return answer;
//     }

//     public static void main(String[] args) {

//         int[] nums = {1, 2, 3, 4};

//         int[] ans = productExceptSelf(nums);

//         for (int x : ans) {
//             System.out.print(x + " ");
//         }
//     }
// }

//------------MORE OPTIMAL WITH O(1) EXTRA SPACE-----------------------------
public class ProductOfArrayExceptSelf{
    public static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        ans[0] = 1;

        for(int i=1; i<n; i++){
            ans[i] = ans[i-1] * arr[i - 1];
        }

         // Multiply with right products
        int rightProduct = 1;

        for(int i=n-1; i>=0; i--){
            ans[i] = ans[i] * rightProduct;

            rightProduct *= arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ansarr = productExceptSelf(arr);

        for(int x : ansarr){
            System.out.print(x + " ");
        }
    }
}