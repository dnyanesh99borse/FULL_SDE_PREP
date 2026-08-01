import java.util.HashMap;

public class LC3LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If the character already exists in the current window
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            // Store the latest index of the character
            map.put(ch, right);

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(str));
    }
}



//import java.util.HashMap;
//
//public class LC3LongestSubstring {
//
//    public static int lengthOfLongestSubstring(String s) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        int left = 0;
//        int maxLength = 0;
//
//        for (int right = 0; right < s.length(); right++) {
//
//            char ch = s.charAt(right);
//
//            // If character is already in the window
//            if (map.containsKey(ch)) {
//                left = Math.max(left, map.get(ch) + 1);
//            }
//
//            // Store/update the latest index of the character
//            map.put(ch, right);
//
//            // Update answer
//            maxLength = Math.max(maxLength, right - left + 1);
//        }
//
//        return maxLength;
//    }
//
//    public static void main(String[] args) {
//
//        String str = "abcabcbb";
//        System.out.println(lengthOfLongestSubstring(str));
//    }
//}