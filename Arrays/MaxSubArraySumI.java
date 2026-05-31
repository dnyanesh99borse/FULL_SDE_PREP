public class MaxSubArraySumI{
    public static void MaxSubArraySum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        if(n == 1){
            System.out.println("The Maximum SubArray Sum is: "+ arr[0]);
            return;
        }
        for(int i=0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                ans = Math.max(ans, sum);
            }
        }
        System.out.println("The Maximum SubArray Sum is: "+ ans);
    }

    public static void main(String[] args){
        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {1};
        MaxSubArraySum(arr);
    }
}