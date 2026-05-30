
//----------IT WILL JUST WORK WHEN THE STRING WILL BE IN SMALL CHARACTERS-----------------


// public class Duplicate{
//     //boolean by default stores false value;
//     public static boolean[] map = new boolean[26];

//     public static void removeDuplicate(String str, int n, String newstr){
//         if(n == str.length() - 1){
//             System.out.println(newstr);
//             return;
//         }
//         char curchar = str.charAt(n);
//         if(map[curchar - 'a'] == true){
//             removeDuplicate(str, n+1, newstr);
//         }else{
//             newstr += curchar;
//             map[curchar - 'a'] = true;
//             removeDuplicate(str, n+1, newstr);
//         }
//     }
//     public static void main(String[] args){
//         String str = "abbccda";
//         removeDuplicate(str,0,"");
//     }
// }


//-------------THIS WILL WORK ONLY WHEN THE STRING WILL BE IN LARGE OR CAPITAL CHARACTERS -------------------
// public class Duplicate{
//     //boolean by default stores false value;
//     public static boolean[] map = new boolean[26];

//     public static void removeDuplicate(String str, int n, String newstr){
//         if(n == str.length() - 1){
//             System.out.println(newstr);
//             return;
//         }
//         char curchar = str.charAt(n);
//         if(map[curchar - 'A'] == true){
//             removeDuplicate(str, n+1, newstr);
//         }else{
//             newstr += curchar;
//             map[curchar - 'A'] = true;
//             removeDuplicate(str, n+1, newstr);
//         }
//     }
//     public static void main(String[] args){
//         String str = "AABBCCDD";
//         removeDuplicate(str,0,"");
//     }
// }


//-----------------WHAT IF WE HAVE TO REMOVE DUPLICATE NO MATTER, IT IS SMALL OR LARGE CHARS-----------------------

public class Duplicate{
    //boolean by default stores false value;
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int n, String newstr){
        if(n == str.length() - 1){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(n);

        // Convert to lowercase for checking
        char lowerChar = Character.toLowerCase(currChar);

        // index from 0 to 25
        int idx = lowerChar - 'a';
        if(map[idx] == true){
            removeDuplicate(str, n+1, newstr);
        }else{
            newstr += currChar;
            map[idx] = true;
            removeDuplicate(str, n+1, newstr);
        }
    }
    public static void main(String[] args){
        String str = "aAABbBcCCdDD";
        removeDuplicate(str,0,"");
    }
}