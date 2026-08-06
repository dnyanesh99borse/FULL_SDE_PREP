import java.util.*;
public class LC438FindAllAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if(p.length() > s.length()){
            return ans;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int count = map.size();

        while(right < s.length()){
            char c = s.charAt(right);

            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);

                if(map.get(c) == 0){
                    count--;
                }
            }
            right++;

            //check for windowlength now
            if(right - left == p.length()){
                if(count == 0){
                    ans.add(left);
                }
                char leftChar = s.charAt(left);

                if(map.containsKey(leftChar)){
                    if(map.get(leftChar) == 0){
                        count++;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s,p));
    }
}



// T: O(n x m)
//--------------------BRUTE FORCE------------------------
//import java.util.*;
//public class LC438FindAllAnagrams {
//        public static List<Integer> findAnagrams(String s, String p) {
//
//            List<Integer> ans = new ArrayList<>();
//
//            HashMap<Character, Integer> map = new HashMap<>();
//
//            // Frequency of p
//            for (int i = 0; i < p.length(); i++) {
//                map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
//            }
//
//            // Check every window
//            for (int i = 0; i <= s.length() - p.length(); i++) {
//
//                HashMap<Character, Integer> temp = new HashMap<>(map);
//
//                int mover = i;
//
//                while (mover < i + p.length()) {
//
//                    char ch = s.charAt(mover);
//
//                    if (!temp.containsKey(ch))
//                        break;
//
//                    temp.put(ch, temp.get(ch) - 1);
//
//                    if (temp.get(ch) < 0)
//                        break;
//
//                    mover++;
//                }
//
//                if (mover == i + p.length()) {
//                    ans.add(i);
//                }
//            }
//
//            return ans;
//        }
//
//    public static void main(String[] args){
//        String s = "cbaebabacd";
//        String p = "abc";
//
//        System.out.println(findAnagrams(s,p));
//    }
//}
