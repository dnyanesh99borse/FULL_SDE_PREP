
// import java.util.*;
// public class PairSum1{
//     public static void main(String[] args){
//         ArrayList<Integer> list = new ArrayList<>(
//             Arrays.asList(1,2,3,4,5,6)
//         );

//         ArrayList<Integer> list2 = new ArrayList<>();

//         int target = 5;

//         for(int i = 0; i < list.size(); i++){
//             for(int j = i+1; j < list.size(); j++){
//                 if(list.get(i) + list.get(j) == target){
//                     list2.add(list.get(i)); list2.add(list.get(j));
                    
//                     System.out.println(list2);
//                     break;
//                 }
//             }
//             if(!list2.isEmpty()){
//                 break;
//             }
//         }
//     }
// }


//------------------USING BRUTE FORCE-----------------------
// public int[] twoSum(int[] arr, int target) {

//         for(int i = 0; i < arr.length; i++){
//             for(int j = i + 1; j < arr.length; j++){
//                 if(arr[i] + arr[j] == target){
//                     return new int[]{i + 1, j + 1}; //here we are returning the result.
//                 }
//             }
//         }

//         return new int[0];
// }


//---------------OPTIMAL APPROACH---------------------------
import java.util.*;
public class PairSum1{
    public static int[] PairSum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(target - arr[end] == arr[start]){
                return new int[]{arr[start],arr[end]};
                // start++;
            }else{
                end--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args){
        // ArrayList<Integer> list = new ArrayList<>(
        //     Arrays.asList(1,2,3,4,5,6)
        // );
        int[] arr = {1,2,3,4,5,6};
        int target = 5;

        // ArrayList<Integer> list2 = new ArrayList<>();
        int[] result = (PairSum(arr, target));

        for(int x : result){
            System.out.print(x + " ");
        }
        // return the pair of that elements.. just one pair will return..
        // if you want all the pairs.. then you can do it also using arraylist.
    }
}