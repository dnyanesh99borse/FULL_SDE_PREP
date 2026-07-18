
//-----------------BRUTE FORCE(ALSO HANDLE EDGE CASES)-------------------------
//-----------------NOT INTERVIEW FRIENDLY--------------------------
// import java.util.*;
// public class FindMissing{
//     public static void main(String[] args){
//         int[] arr = {3, 0, 1};

//         Arrays.sort(arr);
//         for(int x: arr){
//             System.out.print(x + " ");
//         }

//         System.out.println();
//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i+1] != arr[i]+1){
//                 System.out.println(arr[i]+1);
//             }
//         }
//     }
// }


//-------------OPTIMAL APPROACH 1: (SUM FORMULA)---------------------------
//SINCE: Expected Sum = (n(n+1)/2)​
//Limitation of this approach
// For very large values of n, n * (n + 1) can overflow an int. In Java, you can avoid this by using long.

// public class FindMissing{
//     public static void main(String[] args){
//         int[] arr = {3, 0, 1};
//         int n = arr.length;
//         int sum = 0;
//         for(int i=0; i< arr.length; i++){
//             sum += arr[i];
//         }

//         int expectedsum = (n*(n+1)/2);
        
//         int output = expectedsum - sum;

//         System.out.println("missing number: " + output);
//     }
// }


//--------------OPTIMAL APPROACH 2(XOR OPERATOR)--------------
//---------it will only work if the elements in the array is in range[0 - n]

//We never XORed last element, which is also part of the expected range.
//that's why we xor the final output with the last number of the range...
//i.e: int output = arr.length;
// public class FindMissing{
//     public static void main(String[] args){
//         int[] arr = {9,6,4,2,3,5,7,0,1};
//         int n = arr.length-1;
//         int output = arr.length;

//         for(int i=0; i < n; i++){
//             output ^= arr[i];
//             output ^= i;
//         }
//         System.out.println("missing number: " + output);
//     }
// }



//-----------------OPTIMAL APPROACH 3()-------------------------
//------------------------TIME: O(N), SPACE:O(n);---------------
import java.util.*;
public class FindMissing{
    public static void main(String[] args){
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int n = arr.length-1;
        int output = 0;
        
        HashSet<Integer> set = new HashSet<>();

        for(int x : arr){
            set.add(x);
        }

        for(int i=0; i<arr.length; i++){
            if(!set.contains(i)){
                output = i;
                System.out.println("missing number: " + output);
                break;
            }
        }
    }
}