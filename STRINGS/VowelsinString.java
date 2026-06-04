
import java.util.*;
public class VowelsinString{
    public static int VowelsinString(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' && Character.isLowerCase(ch)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to count Vowels in lower: ");
        String str = sc.nextLine();

        System.out.println(VowelsinString(str));
    }
}