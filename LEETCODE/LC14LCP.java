public class LC14LCP{
    public static String longestCommonPrefix(String[] strs){
        String prefix = strs[0];
        if(strs.length <= 1){
            return prefix;
        }
        
        String ans = "";
        for(int i = 1; i < strs.length; i++){
            String nextprefix = strs[i];
            ans = "";
            // System.out.println(nextprefix);
            int start = 0;
                while(start < nextprefix.length() && start < prefix.length() && nextprefix.charAt(start) == prefix.charAt(start)){
                    ans += nextprefix.charAt(start);
                    start++;
                }
            prefix = ans;
        }
        return ans;
    }
    public static void main(String[] args){
        // String[] strs = {"flower","flow","flight"};
        // String[] strs = {"dog","racecar","car"};
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }
}