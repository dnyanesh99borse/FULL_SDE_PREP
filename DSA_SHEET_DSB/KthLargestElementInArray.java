import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new  PriorityQueue<>();

        for(int num : nums){
            minheap.offer(num);

            if(minheap.size() > k){
                minheap.poll();
            }
        }
        return minheap.peek();
    }

    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
