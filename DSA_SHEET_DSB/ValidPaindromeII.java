public class ValidPaindromeII {
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
                //in case like: "abca" the main pint is just to know which character will help us to get palindrom string
                //after removing it.. and thats why.. the odd case like: "abc" it is gonna automatically cover by the isPalindrome
                //function.. and thats why we are handling the case of the even string here.. just checking for each character..
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "abc";
        System.out.println(validPalindrome(s));
    }
}
