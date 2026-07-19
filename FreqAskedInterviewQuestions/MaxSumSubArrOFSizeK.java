public class MaxSumSubArrOFSizeK{
    public static void main(String[] args){
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        int windowsum = 0;

        for(int i = 0; i < k; i++){
            windowsum += arr[i];
        }

        int maxsum = windowsum;
        for(int i=k; i<arr.length; i++){
            // Remove the element leaving the window
            windowsum -= arr[i - k];

            //adding the element entering the window
            windowsum += arr[i];

            // Update answer if needed
            maxsum = Math.max(maxsum,windowsum);
        }

        System.out.println("maximum sum subarray size K is: " + maxsum);
    }
}