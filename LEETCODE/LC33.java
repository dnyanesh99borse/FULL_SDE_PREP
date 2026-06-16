
//------------USING MODIFIED BINARY SEARCH APPROACH----------------------
public class LC33 {

    public static int search(int[] nums, int target) {
        return searchHelper(nums, target, 0, nums.length - 1);
    }

    private static int searchHelper(int[] nums, int target, int si, int ei) {

        // Base Case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (nums[si] <= nums[mid]) {

            // Target lies in left sorted half
            if (target >= nums[si] && target < nums[mid]) {
                return searchHelper(nums, target, si, mid - 1);
            } else {
                return searchHelper(nums, target, mid + 1, ei);
            }
        }

        // Right half is sorted
        else {

            // Target lies in right sorted half
            if (target > nums[mid] && target <= nums[ei]) {
                return searchHelper(nums, target, mid + 1, ei);
            } else {
                return searchHelper(nums, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(search(nums, 0)); // 4
        System.out.println(search(nums, 6)); // 2
        System.out.println(search(nums, 3)); // -1
        System.out.println(search(nums, 7)); // 3
        System.out.println(search(nums, 1)); // 5
    }
}