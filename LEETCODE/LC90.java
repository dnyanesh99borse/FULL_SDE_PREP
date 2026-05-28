
// import java.util.*;

// public class LC90 {

//     public static List<List<Integer>> subsetsWithDup(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         Arrays.sort(nums);
//         Backtrack(nums, new ArrayList<>(), 0, result);
//         return result;
//     }

//     public static void Backtrack(int[] nums, ArrayList<Integer> ans, int i, List<List<Integer>> result) {
//         //base case
//         if (i == nums.length) {
//                 result.add(new ArrayList<>(ans));
//                 return ;
//         }

//         //INCLUDE
//         for(int ite = i; i < nums.length; ite++) {

//             // skip duplicates
//             if(i > ite && nums[i] == nums[i - 1]) {
//                 continue;
//             }
//              ans.add(nums[i]);
//         Backtrack(nums, ans, i + 1, result);
//         //EXCLUDE
//         ans.remove(ans.size() - 1);
//         Backtrack(nums, ans, i + 1, result);
//         }
       
//     }

//     public static void main(String[] args) {
//         // int[] nums = {4,4,4,1,4}; for this input it is creating the error, by generating duplicate pairs.
//         //hence.
//         //Your approach:
//         // Generate ALL subsets
//         // → then remove duplicates using contains()

//         // Optimal approach:
//         // Avoid generating duplicate subsets in the first place
//         int[] nums = {4,4,4,1,4};
//         System.out.println(subsetsWithDup(nums));
//     }
// }


import java.util.*;
public class LC90 {
     public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        Backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

    public static void Backtrack(int[] nums, int i, ArrayList<Integer> ans, List<List<Integer>> result) {
        // BASE CASE
        if(i == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        // INCLUDE CURRENT ELEMENT
        ans.add(nums[i]);

        Backtrack(nums, i + 1, ans, result);

        // BACKTRACK
        ans.remove(ans.size() - 1);

        // SKIP DUPLICATES //no need to check for the same element again so to avoid the duplicate subsets.
        while(i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++; //or continue. it mean skip it and move for next element.
        }

        // EXCLUDE CURRENT ELEMENT
        Backtrack(nums, i + 1, ans, result);
    }

}
