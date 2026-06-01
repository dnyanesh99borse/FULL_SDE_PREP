// public class LC51ContainsDuplicate{
//     public static boolean containsDuplicate(int[] nums) {
//         int n = nums.length;
//         boolean ans = false;
//         for(int i=0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 if(nums[i] == nums[j]){
//                     ans = true;
//                 }else{
//                     ans = false;
//                 }
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args){
//         // int[] nums = {1,2,3,1};
//         // int[] nums = {1,2,3,4};
//         // int[] nums = {1,1,1,3,3,4,3,2,4,2};
//         //----main cases-------
//         // int[] nums = {0};
//         int[] nums = {1,5,-2,-4,0};
//         System.out.println(containsDuplicate(nums));
//     }
// }






//-----------THE ABOVE APPROACH IS GOOD BUT IT WILL GIVE THE PROBLEM IN EXCEEDING TIME LIMIT FOR LARGE ARRAYS------
//THUS USE HASHSET.

import java.util.*;
public class LC51ContainsDuplicate{
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        boolean ans = false;
        Hashset<Integer> set = new HashSet<>();
        for(int = 0; i < n; i++){
            if(set.contains(nums[i])){
                ans = true;
            }else{
                // ans = false;
                set.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        // int[] nums = {1,2,3,1};
        // int[] nums = {1,2,3,4};
        // int[] nums = {1,1,1,3,3,4,3,2,4,2};
        //----main cases-------
        // int[] nums = {0};
        int[] nums = {1,5,-2,-4,0};
        System.out.println(containsDuplicate(nums));
    }
}
