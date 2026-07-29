public class MinimumSizeSubarraySum{
    public static int minSubArrayLen(int target, int[] arr){
        int left = 0;
        int minlength = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            
            while(sum >= target){
                minlength = Math.min(minlength, i - left + 1);
                
                sum -= arr[left];
                left++;
            }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
    public static void main(String[] args){
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(minSubArrayLen(target, arr));
    }
}