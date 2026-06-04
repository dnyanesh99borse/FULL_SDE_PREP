public class ShortestPathString{
    public static float ShortestPath(String str){
        int x1 = 0; int y1 = 0;
        int n = str.length();
        float output = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'W'){
                x1++;
            }else if(str.charAt(i) == 'E'){
                x1--;
            }else if(str.charAt(i) == 'N'){
                y1++;
            }else {
                y1--;
            }
        }
        //here x1 and y1 is already 0 so no meant to play with them.
        int cal = (x1*x1) + (y1*y1);
        output = (float) Math.sqrt(cal);
        return output;
    }
    public static void main(String[] args){
        String str = "WNEENESENNN";
        System.out.println(ShortestPath(str));
    }
}