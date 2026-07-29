public class LC1343{
    public static int numOfSubarrays(int[] arr, int k, int threshold){
        int count = 0;
        int windowsum = 0;

        for(int i=0; i<k; i++){
            windowsum += arr[i];
        }

        if(windowsum/k >= threshold){ //more better: windowsum >= threshold * k
                count++;
        }

        int maxavg = windowsum;
        for(int i=k; i<arr.length; i++){
            maxavg += arr[i];
            maxavg -= arr[i - k];
            if(maxavg/k >= threshold){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;

        System.out.println(numOfSubarrays(arr, k, threshold));
    }
}