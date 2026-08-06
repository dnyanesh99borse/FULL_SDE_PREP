//-----------------------------OPTIMAL APPROACH: PATTERN: IN PLACE REPLACEMENT-----------------------------------
import java.util.*;
public class StringCompression {
    public static int compress(char[] chars) {
        int n = chars.length;
        int read = 0;
        int write = 0;
        int count = 0;

        while(read < n){
            char current = chars[read];

            //count frequency of each charater
            while(read < n && current == chars[read]){
                count++;
                read++;
            }

            chars[write] = current; //write that char on resp. position in original array
            write++;

            if(count > 1){ //write down the freq. of charcters whos freq > 1
                String freq = String.valueOf(count);

                for(char c : freq.toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;
    }

    public static void main(String[] args){
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};

        System.out.println(compress(chars));
    }
}


//--------------------------BRUTE FORCE--------------------------------------------

//import java.util.HashMap;
//
//public class StringCompression {
//    public static int compress(char[] chars) {
//        StringBuilder sb = new StringBuilder();
//
//        int i = 0;
//
//        while (i < chars.length) {
//
//            char current = chars[i];
//            int count = 0;
//
//            while (i < chars.length && chars[i] == current) {
//                count++;
//                i++;
//            }
//
//            sb.append(current);
//
//            if (count > 1)
//                sb.append(count);
//        }
//
//        for (int j = 0; j < sb.length(); j++) {
//            chars[j] = sb.charAt(j);
//        }
//
//        return sb.length();
//    }
//
//    public static void main(String[] args){
//        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//
//        System.out.println(compress(chars));
//    }
//}
