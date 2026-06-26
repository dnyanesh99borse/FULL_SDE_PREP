//------------------------LEETCODE 678(valid parenthesis string)---------------------
import java.util.*;
public class ValidParenthesis{
    public static boolean validParenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '('|| ch == '{' || ch == '['){
                s.push(ch);
            }else{
                //means all closing bracket string or closing intially
                if(s.isEmpty()){
                    return false;
                }
                //now check valid pairs
                char top = s.peek();
                if((top == '{' && ch == '}') 
                || (top == '(' && ch == ')') 
                || (top == '[' && ch == ']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){  //means there still some braces means invalid
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        // String str = "({}]})";
        // String str = "({[]})";
        String str = ")(";

        System.out.println(validParenthesis(str));
    }
}
//-----------------LEETCODE - 20(valid parenteheses)--------------------------
// import java.util.*;
// public class ValidParenthesis{
//     public static boolean validParenthesis(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             //opening
//             if(ch == '('|| ch == '{' || ch == '['){
//                 s.push(ch);
//             }else{
//                 //means all closing bracket string or closing intially
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 //now check valid pairs
//                 char top = s.peek();
//                 if((top == '{' && ch == '}') 
//                 || (top == '(' && ch == ')') 
//                 || (top == '[' && ch == ']')){
//                     s.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }

//         if(s.isEmpty()){  //means there still some braces means invalid
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args){
//         // String str = "({}]})";
//         // String str = "({[]})";
//         String str = ")(";

//         System.out.println(validParenthesis(str));
//     }
// }