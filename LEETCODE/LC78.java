
import java.util.*;
public class LC78{
    public static void printSubsets(int[] arr, ArrayList<Integer> ans, int i){
        //base case
        if(i == arr.length){
            System.out.println(ans);
            return;
        }

        //include
        ans.add(arr[i]); //add current element
        printSubsets(arr, ans, i+1);

        //exclude
        ans.remove(ans.size() - 1); //remove last element 
        printSubsets(arr, ans, i+1);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        printSubsets(arr, ans, 0);
    }
}