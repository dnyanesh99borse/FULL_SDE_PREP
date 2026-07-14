import java.util.*;
//-----------------BRUTE FORCE APPROACH--------------------

// public class CountFreq{
//     public static void main(String[] args) {

//         int[] arr = {1, 2, 2, 3, 1, 4, 2};

//         for (int i = 0; i < arr.length; i++) {

//             // Check if the current element has already been counted
//             boolean alreadyCounted = false;

//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     alreadyCounted = true;
//                     break;
//                 }
//             }

//             // If already counted, skip it
//             if (alreadyCounted) {
//                 continue;
//             }

//             // Count frequency
//             int count = 1;

//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }

//             System.out.println(arr[i] + " -> " + count);
//         }
//     }
// }


//---------------------OPTIMAL APPROACH(USING HASHMAP)---------------------------
// public class CountFreq{
//     public static void main(String[] args){
//         int[] arr = {1, 2, 2, 3, 1, 4, 2};
//         HashMap<Integer,Integer> map = new HashMap<>();


//         for (int num : arr) {
//             if (map.containsKey(num)) {
//                 map.put(num, map.get(num) + 1);
//             } else {
//                 map.put(num, 1);
//             }
//         }

//         System.out.println(map);
//     }
// }


//---------------------STRINGS: OPTIMAL APPROACH(USING FREQ ARRAY)---------------------------
public class CountFreq{
    public static void main(String[] args){
        String str = "helllewowowpdpdpuu";
        String str = "abacaba";

    int[] freq = new int[26];

    for (char ch : str.toCharArray()) {
        freq[ch - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0) {
        System.out.println((char)(i + 'a') + " -> " + freq[i]);
        }
    }
        }
    }