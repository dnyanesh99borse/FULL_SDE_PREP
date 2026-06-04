
//-----------BRUTE FORCE APPROACH-------------------
//1. traverse the original string and check each character of the original string with 
//each character of the Anagramed string.. till the end of the string if all the characters
//present in anagramed string means it is anagram.. otherwise it is not...
//-----------USING .contains() FUNCTION-------------------
//2. traverse the original string and just apply the .contains() function on the another 
//second string and check whether each character of the original string presents in the second string or not..
//if yes ---> it is anagaram else if No ---> it is not anagram


// public class LCValidAnagram {

//     public static boolean validAnagram(String str, String t) {
//         if (str.length() != t.length()) {
//             return false;
//         }

//         StringBuilder sb = new StringBuilder(t);

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             int idx = sb.indexOf(String.valueOf(ch));

//             if (idx == -1) {
//                 return false;
//             }

//             sb.deleteCharAt(idx);
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "angram";
//         String t = "nagaram";
//         System.out.println(validAnagram(str, t));
//     }
// }


//---------------OPTIMAL APPROACH--------------------------
public class LCValidAnagram {

    public static boolean validAnagram(String str, String t) {
        if(str.length() != t.length()){
            return false;
        }

        int[] freq = new int[26];

        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++; //a - a = 0.. 0++ = 1 and so on...
            freq[t.charAt(i) - 'a']--;
        }

        for(int x : freq){
            if(x != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "angram";
        String t = "nagaram";
        System.out.println(validAnagram(str, t));
    }
}