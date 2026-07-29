import java.util.*;
public class LC1456{
    public static int maxVowels(String s, int k) {
        int windowsum = 0;
        int count = 0;
        int maxcount = 0;

        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        maxcount = count;

        //sliding window
        for(int i=k; i<s.length(); i++){
            char ch = s.charAt(i);
            //add right element
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }

            char ch2 = s.charAt(i-k);
            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'){
                count--;
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }

    public static void main(String[] args){
        String str = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(str, k));
    }
}