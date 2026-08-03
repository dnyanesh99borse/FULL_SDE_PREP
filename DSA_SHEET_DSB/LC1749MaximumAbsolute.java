public class LC1749MaximumAbsolute {
    public static int maxAbsoluteSum(int[] nums) {
        //maximum subarray sum
        int currsum = 0;
        int maxsum = 0;
        int currmin = 0;
        int minsum = 0;

        for(int i=0; i<nums.length; i++){
            if(currsum < 0){
                currsum = 0;
            }
            currsum += nums[i];
            maxsum = Math.max(maxsum, currsum); //maximum subarray sum

            if(currmin > 0){
                currmin = 0;
            }
            currmin += nums[i];
            minsum = Math.min(minsum, currmin); //minimum subarray sum
        }
        return Math.max(Math.abs(minsum), Math.abs(maxsum));
    }

    public static void main(String[] args){
        int[] nums = {2,-5,1,-4,3,-2};

        System.out.println(maxAbsoluteSum(nums));
    }
}
