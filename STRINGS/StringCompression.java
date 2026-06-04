public class StringCompression{
    public static String stringCompression(String str){
        String newstr = "";
        int[] freq = new int[26];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1){
                //to get char from index of freq
                char ch = (char)(i + 'a');
                newstr += ch;
                newstr += freq[i];   
            }else if(freq[i] == 1){
                return str;
            }else{
                return newstr;
            }
        }
        return newstr;
    }
    public static void main(String[] args){
        // String str = "aaabbcccdd";
        String str = "abcde";
        System.out.println(stringCompression(str));
    }
}