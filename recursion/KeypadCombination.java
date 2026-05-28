
//VERY VERY VERY IMPORTANT QUESTION 

public class KeypadCombination{
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void KeypadComb(String str, int idx, String Combination){
        
        //the whole game is on this base case.
        if(idx == str.length()){
            System.out.println(Combination);
            return;
        }
        char currchar = str.charAt(idx); //intitially --> 2 from 23
        //here actually it is converting string 2 to integer 2 using that -'0' so that
        //we can actually access that respective string from array.
        String mapping = keypad[currchar - '0']; //2 - 0 = 2
        for(int i=0; i<mapping.length(); i++){
            KeypadComb(str, idx + 1, Combination + mapping.charAt(i));
        }
    }
    
    public static void main(String[] args){
        String str = "32";
        KeypadComb(str, 0, "");
    }
}