//the below is the general logic code of the subset by our own.
// import java.util.*;
// public class LC78{
//     public static void printSubsets(int[] arr, ArrayList<Integer> ans, int i){
//         //base case
//         if(i == arr.length){
//             System.out.println(ans);
//             return;
//         }

//         //include
//         ans.add(arr[i]); //add current element
//         printSubsets(arr, ans, i+1);
//         //exclude
//         ans.remove(ans.size() - 1); //remove last element 
//         printSubsets(arr, ans, i+1);
//     }
//     public static void main(String[] args){
//         int[] arr = {1,2,3};
//         ArrayList<Integer> ans = new ArrayList<>();
//         printSubsets(arr, ans, 0);
//     }
// }



//NOW JUST IMPLEMENT THE SAME IN A LEETCODE MANNER

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Backtrack(nums, 0, new ArrayList<>(), result);
//         return result;
//         if(n == nums.length){
//             return list;
//         }
//         ans.add()
//     }
// }



//THIS IS THE EXACT CODE AND LOGIC AS WE DID ABOVE JUST TO SEEMS IT MORE COMPLEX AND TRICKY THEY JUST GAVE US ONE SINGLE PARAMETER
//WHERE WE WERE USING MULTIPLE, SO THE EXTRA EFFORTS WE HAVE TO TAKE ARE JUST TO AJUST THEM PROPERLY TO GET THE OUTPUT IN THEIR STRUCTURE ITSELF.
import java.util.*;
public class LC78 {
    public static List<List<Integer>> printSubsets(int[] arr) {
        //new list to store output of the function and we can directly store the output of the backtrack function directly
        //into result list though it is a list but there types are different one is object after being passed as a function 
        //another is list
        //so just give that list to the function itself it will fill it up or updated it up with the results for you and 
        //thereafter just ask the function for our list again and return it.
        List<List<Integer>> result = new ArrayList<>();
        Backtrack(arr, new ArrayList<>(), 0, result);
        return result;
    }

    public static List<List<Integer>> Backtrack(int[] arr,ArrayList<Integer> ans, int i, List<List<Integer>> result){
        //base case
        if (i == arr.length) {
            result.add(new ArrayList<>(ans)); //it is very important.
            return result;
        }

        //include
        ans.add(arr[i]); //add current element
        Backtrack(arr, ans, i + 1,result);

        //exclude
        ans.remove(ans.size() - 1); //remove last element 
        Backtrack(arr, ans, i + 1,result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(printSubsets(arr));
    }
}
