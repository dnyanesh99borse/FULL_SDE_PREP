public class FirstLastOcc{
    //we are making it static to save memory of stack
    //else it will make the memory again and 
    public static int first = -1;
    public static int last = -1;

    public static void PrintOccu(String s, int idx, char element){
        if(idx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currel = s.charAt(idx);
        if(currel == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        PrintOccu(s, idx+1, element);
    }

    public static void main(String[] args){
        String s = "abaacdaefaah";
        int idx = s.length();
        PrintOccu(s,0,'a');
    }
}