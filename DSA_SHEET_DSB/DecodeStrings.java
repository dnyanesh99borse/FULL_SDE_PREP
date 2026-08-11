import java.util.*;
public class DecodeStrings {
    public static String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currnumber = 0;

        for(char c : s.toCharArray()){
            // If character is a digit
            if(Character.isDigit(c)){
                currnumber = currnumber * 10 + c - '0';
            }

            // If '[' is encountered
            else if (c == '[') {
                numberStack.push(currnumber);
                stringStack.push(currentString);

                currnumber = 0;
                currentString = "";
            }

            // If '[' is encountered
            else if (c == ']') {
                int repeat = numberStack.pop();
                String previousString = stringStack.pop();

                StringBuilder temp = new StringBuilder();

                for (int i = 0; i < repeat; i++) {
                    temp.append(currentString);
                }

                currentString = previousString + temp.toString();
            }

            else {
                currentString += c;
            }
        }
        return currentString;
    }
    public static void main(String[] args){
        String s = "3[a]2[bc]";

        System.out.println(decodeString(s));
    }
}
