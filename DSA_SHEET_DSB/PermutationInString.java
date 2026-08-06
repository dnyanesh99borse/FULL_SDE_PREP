import java.util.HashMap;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int count = map.size();

        while (right < s2.length()) {

            char ch = s2.charAt(right);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0)
                    count--;
            }

            right++;

            if (right - left == s1.length()) {

                if (count == 0)
                    return true;

                char leftChar = s2.charAt(left);

                if (map.containsKey(leftChar)) {

                    if (map.get(leftChar) == 0)
                        count++;

                    map.put(leftChar, map.get(leftChar) + 1);
                }

                left++;
            }
        }

        return false;
    }

    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1,s2));
    }
}
