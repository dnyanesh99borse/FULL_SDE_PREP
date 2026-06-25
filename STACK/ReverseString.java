import java.util.*;
public class ReverseString{
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args){
        System.out.print(reverseString("hellow"));
    }
}



//-----------OR Stack<Integer> s = new Stack<>();

// System.out.println(s.size()); // 0

// s.push(10);
// s.push(20);

// System.out.println(s.size()); // 2

// s.pop();

// System.out.println(s.size()); 