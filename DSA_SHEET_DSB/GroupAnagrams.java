

//-------------------OPTIMAL(HASHMAP)---------------------------------
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] charArr = s.toCharArray();

            Arrays.sort(charArr);

            String key = String.valueOf(charArr);

            if (map.containsKey(key)) {

                map.get(key).add(s);

            } else {

                List<String> list = new ArrayList<>();

                list.add(s);

                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }
}


//----------------BRUTE FORCE APPROACH--------------------------------------

//import java.util.ArrayList;
//import java.util.List;
//public class GroupAnagrams {
//        public static List<List<String>> groupAnagrams(String[] strs) {
//
//            List<List<String>> ans = new ArrayList<>();
//
//            boolean[] visited = new boolean[strs.length];
//
//            for (int i = 0; i < strs.length; i++) {
//
//                if (visited[i])
//                    continue;
//
//                List<String> group = new ArrayList<>();
//
//                group.add(strs[i]);
//                visited[i] = true;
//
//                for (int j = i + 1; j < strs.length; j++) {
//
//                    if (!visited[j] && isAnagram(strs[i], strs[j])) {
//
//                        group.add(strs[j]);
//                        visited[j] = true;
//                    }
//                }
//
//                ans.add(group);
//            }
//
//            return ans;
//        }
//
//        public static boolean isAnagram(String s1, String s2) {
//
//            if (s1.length() != s2.length())
//                return false;
//
//            int[] freq = new int[26];
//
//            for (int i = 0; i < s1.length(); i++) {
//
//                freq[s1.charAt(i) - 'a']++;
//                freq[s2.charAt(i) - 'a']--;
//            }
//
//            for (int x : freq) {
//
//                if (x != 0)
//                    return false;
//            }
//
//            return true;
//        }
//
//    public static void main(String[] args){
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//
//        System.out.println(groupAnagrams(strs));
//    }
//}
