import java.util.HashSet;

public class PalindromicSubstrings {
    public static int countSubstrings(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        if (s.length() < 2) {
            return 1;
        }

        for(int i=0; i<s.length(); i++){
            //for single characters cause all single charactes will be palindromic substrings
            if(!(set.contains(s.charAt(i)))){
                set.add(s.charAt(i));
                count++;
            }

            //now check for each character using
        }
        return count;
    }
    public static void main(String[] args){
        String s = "abc";
        System.out.println(countSubstrings(s));
    }
}
