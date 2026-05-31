//now this is our code done with printing of the all the possibilities of the tiles
//but this is with the pattern of the INCLUDE AND EXCLUDE which mostly gives all the subsets 

// import java.util.*;
// public class LC1079 {
//     public static void numTilePossibilities(String tiles, int idx, StringBuilder ans) {
//         if(idx == tiles.length()){
//             System.out.println(ans);
//             return;
//         }

//         char curchar = tiles.charAt(idx);
//         //include
//         numTilePossibilities(tiles, idx + 1, ans.append(curchar));

//         //exclude
//         numTilePossibilities(tiles, idx + 1, ans.deleteCharAt(ans.length() - 1));
//     }

//     public static void main(String[] args){
//         String tiles = "ABC";
//         numTilePossibilities(tiles, 0, new StringBuilder());
//     }
// }



//NOW WE'LL JUST TRY TO GET THEIR SUM AS WANT IN LC1079 QUESTION

//SINCE WE WANT THAT THE PATTERN SHOULD COVER ALL THE POSSIBLE COMBINATIONS AND NOT THE SUBSETS THEN
//WE WOULD HAVE TO USE THE LOGIC OR PATTERN OF PEMUTATION.. 
// public class LC1079 {
//     public static void numTilePossibilities(String base, StringBuilder ans) {

//     for(int i=0;i<base.length();i++) {

//         if(i>0 && base.charAt(i)==base.charAt(i-1))
//             continue;

//         char curr = base.charAt(i);

//         ans.append(curr);

//         System.out.println(ans);

//         String newBase = base.substring(0,i) + base.substring(i+1);

//         numTilePossibilities(newBase, ans);

//         ans.deleteCharAt(ans.length()-1);
//     }
// }

//     public static void main(String[] args){
//         String tiles = "AAB";
//         numTilePossibilities(tiles, new StringBuilder());
//     }
// }



//------------NOW WE DONE WITH GETTING ALL THE POSSIBLE PERMUTATIONS OF THE STRING BUT AS PER THE QUESTION WE HAVE TO RETURN THE TOTAL NUMBER OF PERMUTATIONS-----

// public class LC1079{
//     public static int numTilePossibilities(String tiles){
//         for(int i = 0; i<tiles.length(); i++){
//             if(i)
//         }
//     }

//     public static void main(String[] args){
//         String tiles = "AAB";
//         numTilePossibilities(tiles);
//     }
// }


import java.util.*;
public class LC1079 {

    public static int numTilePossibilities(String tiles) {

        char[] arr = tiles.toCharArray();
        Arrays.sort(arr); //v.v.i.m.p

        //we did it like passing the same string again as array due to sorting we wanted only.
        return helper(new String(arr));
    }

    private static int helper(String tiles) {

        int count = 0;

        for(int i = 0; i < tiles.length(); i++) {

            // Skip duplicates at the same recursion level
            if(i > 0 && tiles.charAt(i) == tiles.charAt(i - 1)) {
                continue;
            }

            //this is for excluding the current char from the string and pass the new string.
            String newTiles = tiles.substring(0, i) + tiles.substring(i + 1);

            // Current sequence contributes 1
            count++;

            // Explore longer sequences
            count += helper(newTiles);
        }

        return count;
    }

    public static void main(String[] args){
        String tiles = "AAB";
        System.out.println(numTilePossibilities(tiles));
    }
}