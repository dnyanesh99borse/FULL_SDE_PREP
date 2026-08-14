import java.util.*;

public class RemoveDuplicateLettersLC316 {

    public static String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];

        // Count frequency of all characters
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Process each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Current occurrence is being processed
            count[ch - 'a']--;

            // If character is already in stack, skip it
            if (visited[ch - 'a']) {
                continue;
            }

            // Remove larger characters if they appear again later
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && count[stack.peek() - 'a'] > 0) {

                char removed = stack.pop();

                visited[removed - 'a'] = false;
            }

            // Add current character
            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        // Convert stack to String
        StringBuilder result = new StringBuilder();

        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "cbacdcbc";

        System.out.println(removeDuplicateLetters(s));
    }
}