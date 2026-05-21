public class LC35{
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsert(nums,target));
    }

}

// JUST THE MAIN LOGIC IS OF RETURNING START;
// CAUSE , WHEN THE MID > TARGET WE ARE MOVING TOWARDS THE LEFT HALF
// WHEN THE MID < TARGET WE ARE MOVING TOWARDS THE RIGHT HALF
// BY CHAINGING THE VALUE OF START AND THE END;
// AND WHILE WE ARE SEARCHING FOR OUR TARGET IT IS STOPPING AT MID VALUE WHICH IS MID < TARGET AND HENCE START BECOME START = MID + 1;
// MEANS ONE INDEX AHEAD OF MID AND THAT TIME IF IT IS ON THE RETURN STATEMENT MEANS
// START > END HENCE IT RETURNS THE START
// THAT IS THE ACTUAL INDEX VALUE FOR THE TARGETED VALUED.