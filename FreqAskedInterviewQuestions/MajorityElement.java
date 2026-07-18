// //-------------------BRUTE FORCE APPROACH-------------------P
// public class MajorityElement {

//     public static void main(String[] args) {
//         int[] arr = {3,2,3};
//         int n = arr.length;
//         int limit = n/2;

//         for(int i=0; i<arr.length; i++){
//             int count = 0;
//             for(int j=i; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count > limit){
//                 System.out.println("majority element is: " + arr[i]);
//             }
//         }
//     }
// }


//------------------OPTIMAL APPROACH------------------------------
// //-------------------BOYER MORE APPROACH-------------------------
// public class MajorityElement {

//     public static void main(String[] args) {
//         int[] arr = {3,2,3};
//         int n = arr.length;
//         int candidate = 0;
//         int count = 0;

//         for(int num: arr){
//             if(count == 0){
//                 candidate = num;
//             }

//             if(num == candidate){
//                 count++;
//             }else{
//                 count--;
//             }
//         }
//         System.out.println("Majority element is: "+ candidate);
//     }
// }



//-------------------HASHMAP APPROACH-------------------------
import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxFreq = 0;
        int majority = -1;

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > maxFreq) {
                maxFreq = map.get(num);
                majority = num;
            }
        }

        System.out.println("Majority Element: " + majority);
    }
}