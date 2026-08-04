public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            //left: remove all the thing other than char or digits
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            //Right: remove all the thing other than char or digits
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "race a car";

        System.out.println(isPalindrome(str));
    }
}
