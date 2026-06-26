import java.util.*;
public class DuplicateParentheses{
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                //opening 
                s.push(ch);  //rest all push in stack
            }
        }
        return false; //means till this duplicate not found
    }
    public static void main(String[] args){
        // String str = "(((a + b)) + (c + d))"; //duplicate
        String str = "((a + b) + (c + d))"; //not duplicate: false

        System.out.println(isDuplicate(str));
    }
}