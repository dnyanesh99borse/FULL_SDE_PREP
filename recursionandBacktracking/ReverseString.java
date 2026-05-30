public class ReverseString{
    public static void PrintReverse(int n, String s){
        if(n == 0){
            System.out.print(s.charAt(n));
            return;
        }
        //first time here iteration will come and it will print the char of the nth position
        //hence print here and not below the recursive call.
        System.out.print(s.charAt(n));
        PrintReverse(n - 1, s);
    }

    public static void main(String[] args){
        String s = "abcd";
        int n = s.length() - 1;
        PrintReverse(n, s);
    }
}