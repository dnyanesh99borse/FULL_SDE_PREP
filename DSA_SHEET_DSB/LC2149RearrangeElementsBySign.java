import java.util.Arrays;

public class LC2149RearrangeElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 1;
        int[] ans = new int[nums.length];

        for(int num : nums){
            if(num > 0){
                ans[p] = num;
                p += 2;
            }else{
                ans[n] = num;
                n += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(arr);

        for(int num: ans){
            System.out.print(num + " ");
        }
    }
}
