public class LC424LReapeatCharReplace{
    public static int characterReplacement(String s, int k){
        int[] freq = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxWindow = 0;

        //get max freq character.
        for(int right=0; right<s.length(); right++){
            //first store frequency of each char of string
            freq[s.charAt(right) - 'A']++;
            //get max frequency
            maxfreq = Math.max(maxfreq,freq[s.charAt(right) - 'A']);

            //get windowlength(as we have to return longest window that is longest reapeat char)
            int windowLength = right - left + 1;

            if(windowLength - maxfreq > k){
                //store previous window or string first
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            windowLength = right - left + 1;
            maxWindow = Math.max(maxWindow, windowLength);

        }
        return maxWindow;
    }

    public static void main(String[] args){
        String s = "BAABAAAB";
        int k = 2;

        System.out.println("Output: " + characterReplacement(s, k));
    }
}