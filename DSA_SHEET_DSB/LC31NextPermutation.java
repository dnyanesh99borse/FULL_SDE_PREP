import java.util.Arrays;

public class LC31NextPermutation {
    public static void reverse(int[] nums, int left, int right){
        while(left < right){
            int helper = nums[left];
            nums[left] = nums[right];
            nums[right] = helper;

            left++;
            right--;
        }
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot1 = -1;
        int smallest = -1;

        //find 1st smallest
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot1 = i;
                break;
            }
        }

        //handle edge case
        if(pivot1 == 0){
            reverse(nums, 0, n-1);
            return;
        }

        //find 2nd smallest
        for(int i=n-1; i>pivot1; i--){
            if(nums[i] > nums[pivot1]){
                smallest = i;
                break;
            }
        }

        //swap 1st smallest/pivot with second smallest
        int temp = nums[pivot1];
        nums[pivot1] = nums[smallest];
        nums[smallest] = temp;

        //reverse from pivot1+1 to n
        int left = pivot1+1;
        int right = n-1;

        reverse(nums, left, right);

    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }
}
