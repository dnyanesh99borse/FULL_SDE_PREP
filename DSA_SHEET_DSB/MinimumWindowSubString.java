import java.util.HashMap;

public class MinimumWindowSubString {

    public static String minWindow(String s, String t) {

        // 1. Store required frequency of each character
        HashMap<Character, Integer> required = new HashMap<>();

        for (char c : t.toCharArray()) {
            required.put(c, required.getOrDefault(c, 0) + 1);
        }

        // 2. Store frequency of characters inside current window
        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;

        // Number of required characters whose frequency is satisfied
        int have = 0;

        // Number of unique characters required
        int need = required.size();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        // 3. Expand window using right
        while (right < s.length()) {

            char c = s.charAt(right);

            // Add current character to window
            window.put(c, window.getOrDefault(c, 0) + 1);

            // If this character's required frequency is satisfied
            if (required.containsKey(c)
                    && window.get(c).intValue() == required.get(c).intValue()) {

                have++;
            }

            // 4. If window is valid, shrink from left
            while (have == need) {

                // Update minimum window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                // Character that we are removing
                char leftChar = s.charAt(left);

                // Remove it from window
                window.put(leftChar, window.get(leftChar) - 1);

                // If removing it makes the window invalid
                if (required.containsKey(leftChar)
                        && window.get(leftChar) < required.get(leftChar)) {

                    have--;
                }

                // Move left forward
                left++;
            }

            // Expand right
            right++;
        }

        // 5. No valid window found
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        // 6. Return minimum window
        return s.substring(start, start + minLength);
    }


    // MAIN METHOD
    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = minWindow(s, t);

        System.out.println("Minimum Window Substring: " + result);
    }
}