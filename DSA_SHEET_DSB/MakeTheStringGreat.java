
import java.util.Stack;

public class MakeTheStringGreat {

    public static String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);

            if (!stack.isEmpty() &&
                    Math.abs(stack.peek() - c1) == 32) {

                stack.pop();

            } else {
                stack.push(c1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "leEeetcode";

        System.out.println(makeGood(str));
    }
}

//Characters	Difference	 Action
//a, A	       32	     Remove
//b, B	       32	     Remove