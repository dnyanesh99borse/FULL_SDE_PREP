import java.util.Stack;

public class BackspaceStringCompare {

    public static Boolean Compare(String s, String t) {
        String op1 = backspaceCompare(s);
        String op2 = backspaceCompare(t);

        return op1.equals(op2);
    }

    public static String backspaceCompare(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                stack.pop(); //remove peek element
            }else{
                stack.push(s.charAt(i));
            }
        }

        return String.valueOf(stack);
    }

    public static void main(String[] args){
        String s = "a#c";
        String t = "b";

        System.out.println(Compare(s,t));
    }
}
