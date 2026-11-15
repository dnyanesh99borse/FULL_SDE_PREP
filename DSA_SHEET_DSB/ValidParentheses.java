
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else {

                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if(ch == ')' && top != '(' ||
                        ch == '}' && top != '{' ||
                        ch == ']' && top != '[') {

                    return false;
                }
            }
        }

        return stack.isEmpty(); //by default if IT would be a Valid Parentheses then the stack will be empty at the end.
    }

    public static void main(String[] args) {

        String s = "()[]{}";

        System.out.println(isValid(s));
    }
}
