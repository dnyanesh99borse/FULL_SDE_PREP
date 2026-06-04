public class ConverttoUpperCase{
    public static StringBuilder toUpperCase(String str){
        StringBuilder sb = new StringBuilder(str);

         // capitalize first character
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        for(int i = 0; i < sb.length() - 1; i++){
            // char ch = sb.charAt(i);
            if(!Character.isLetterOrDigit(sb.charAt(i))){
                if(Character.isLetter(sb.charAt(i+1))){
                    // Character.toUpperCase(sb.charAt(i+1)); //it will return 'A' or like that
                    //but will not change directly into stringbuilder.
                    sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
                }
            }
        }
        return sb;
    }

    public static void main(String[] args){
        String str = "hi, i am shradha";
        System.out.println(toUpperCase(str));
    }
}