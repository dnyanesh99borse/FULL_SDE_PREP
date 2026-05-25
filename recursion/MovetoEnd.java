public class MovetoEnd{
    public static void moveToEnd(String str, int n, int count, String newstr){
        if(n == str.length()){
            for(int i=0; i < count; i++){
              newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
       
        char curel = str.charAt(n);
        if(curel == 'x'){
            count++;
            moveToEnd(str,n+1,count, newstr);
        }else{
            newstr += curel;
            moveToEnd(str, n + 1, count, newstr);
        }
        
    }
    public static void main(String[] args){
        String str = "axbcxxd";

        moveToEnd(str,0,0, "");
    }
 }