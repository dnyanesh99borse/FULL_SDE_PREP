//--------------------BRUTE FORCE-------------------------------
//class Solution {
//    public boolean isIsomorphic(String s, String t) {
//
//        int n = s.length();
//
//        for (int i = 0; i < n; i++) {
//
//            for (int j = i + 1; j < n; j++) {
//
//                // Same character in s must map to same character in t
//                if (s.charAt(i) == s.charAt(j)) {
//                    if (t.charAt(i) != t.charAt(j)) {
//                        return false;
//                    }
//                }
//
//                // Different characters in s cannot map to same character in t
//                else {
//                    if (t.charAt(i) == t.charAt(j)) {
//                        return false;
//                    }
//                }
//            }
//        }
//
//        return true;
//    }
//}

//---------------OPTIMAL APPROACH T:O(N), S:O(N):TWO HASHMAPS-------------------
//1. Traverse both the strings simultaneously
//2. get c1 and c2 from string s and t respectively
//3. find whether c1 present in map1 or not?
//4. if c1 present in map1 then check whether pair of c1 in map1 should c2: i.e: map1.get(c1) == c2;
//5. if condition fails return false else add the c1 and c2 in map1 as pair
//6. now find whether c2 present in map2 or not?
//7. if c2 present in map2 then check whether pair of c2 in map1 should c1: i.e: map1.get(c2) == c1;
//8. if condition fails return false else add the c1 and c2 in map1 as pair
//9. if false condition not met then return true bydefault;

import java.util.HashMap;

public class IsomorphichStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>(); //straight mapping
        HashMap<Character,Character> map2 = new HashMap<>(); //reverse mapping

        //traverse both strings
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map1.containsKey(c1)){
                if(!(map1.get(c1) == c2)){
                    return false;
                }
            }else{
                //otherwise store it
                map1.put(c1,c2);
            }

            if(map2.containsKey(c2)){
                if(!(map2.get(c2) == c1)){
                    return false;
                }
            }else{
                //otherwise store it in map2
                map2.put(c2, c1);
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
    }
}
