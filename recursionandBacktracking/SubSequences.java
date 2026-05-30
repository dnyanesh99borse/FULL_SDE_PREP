//very Important and most used pattern based problem..
// mind it and understand its workflow meticulously.

import java.util.*;
public class SubSequences{

    public static void findSubSequences(String str, int n, String newstr, HashSet<String> set){
        if(n == str.length()){
            if(set.contains(newstr)){
                return;
            }else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        char currchar = str.charAt(n);
        //to be added
        findSubSequences(str, n + 1, newstr + currchar, set);

        //not to be added
        findSubSequences(str, n + 1, newstr, set);
    }
    public static void main(String[] args){
        // String str = "abc";
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        findSubSequences(str, 0, "",set);
    }
}