public class PalindromicSubstrings {

    int count = 0;

    public int PalindromicSubStrings(String s) {

        count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            expand(s, i, i);

            // Even length
            expand(s, i, i + 1);
        }

        return count;
    }

    public void expand(String s, int left, int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            count++;

            left--;
            right++;
        }
    }

    public static void main(String[] args) {

        PalindromicSubstrings obj = new PalindromicSubstrings();

        System.out.println(obj.PalindromicSubStrings("aaa"));
    }
}