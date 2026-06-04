public class Palindrome{
    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        boolean ispalindrome = false;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                ispalindrome = true;
            }
            start++;
            end--;
        }
        return ispalindrome;
    }
    public static void main(String[] args){
        String str = "Hellowbuddy";
        // String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}