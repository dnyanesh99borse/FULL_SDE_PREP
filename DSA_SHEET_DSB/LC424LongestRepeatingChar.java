//---------------------BRUTE FORCE---------------------------

public class LC424LongestRepeatingChar {
    public static int characterReplacement(String s, int k){
        int left = 0;
        int maxfreq = 0;
        int maxwindow = 0;
        int[] freq = new int[26];

        for(int right=0; right<s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);

            int windowlength = right - left + 1;

            if(windowlength - maxfreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            windowlength = right - left + 1;

            //the updated largest windowlength will be the updated maxwindow
            maxwindow = Math.max(maxwindow, windowlength);
        }
        return maxwindow;
    }
    public static void main(String[] args){
        String s = "ABAB";
        int k = 2;

        System.out.println(characterReplacement(s,k));
    }
}




// ---------------------BRUTE FORCE---------------------------
//
//public class LC424LongestRepeatingChar {
//    public static int characterReplacement(String s, int k){
//        int n = s.length();
//        int maxLen = 0;
//
//        for(int i = 0; i<n; i++){
//            int[] freq = new int[26];
//            int maxfreq = 0;
//
//            for(int j = 0; j < n; j++){
//                char ch = s.charAt(j);
//
//                freq[ch - 'A']++;
//                maxfreq = Math.max(maxfreq, freq[ch - 'A']);
//
//                int length = j - i + 1;
//                if(length - maxfreq <= k){
//                    maxLen = Math.max(maxLen, length);
//                }
//            }
//        }
//        return maxLen;
//    }
//    public static void main(String[] args){
//        String s = "ABAB";
//        int k = 2;
//
//        System.out.println(characterReplacement(s,k));
//    }
//}
