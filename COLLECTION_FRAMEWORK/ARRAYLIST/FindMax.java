
import java.util.*;
public class FindMax{
    public static int Max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(10,20,30,40,50)
        );

        System.out.println(Max(list));
    }
}