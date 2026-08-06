public class LongestPalindromicSubString {

    static int maxLength = 0;
    static int start = 0;

    public static String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        // Reset static variables for each call
        start = 0;
        maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            expand(s, i, i);

            // Even length palindrome
            expand(s, i, i + 1);
        }

        return s.substring(start, start + maxLength);
    }

    public static void expand(String s, int left, int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        int length = right - left - 1;

        if (length > maxLength) {
            maxLength = length;
            start = left + 1;
        }
    }

    public static void main(String[] args) {

        String str = "babad";

        System.out.println(longestPalindrome(str));
    }
}