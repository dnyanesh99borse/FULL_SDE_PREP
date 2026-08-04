public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        int[] freq = new int[26];

        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int count: freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "silent";
        String t = "listen";

        System.out.println(isAnagram(s,t));
    }
}
