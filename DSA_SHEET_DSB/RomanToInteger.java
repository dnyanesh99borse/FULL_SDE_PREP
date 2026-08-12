import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int output = 0;

        for(int i=0; i<s.length() ; i++){
            char left = s.charAt(i);

            if(i+1 < s.length()){
                char right = s.charAt(i+1);

                if(map.get(right) > map.get(left)){
                    output -= map.get(left);
                }else{
                    output += map.get(left);
                }
            }else{
                output += map.get(left);
            }

        }
        return output;
    }

    public static void main(String[] args){
        String s = "III";

        System.out.println(romanToInt(s));
    }
}
