
import java.util.*;
public class MonotonicArrayList{
    public static boolean isMonotonic(ArrayList<Integer> list){
        int start = 0;
        int end = list.size() - 1;
        while(start != end){
            if(list.get(start) >= list.get(start+1)){
                return true;
            }
            if(list.get(start) <= list.get(start+1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(
            // Arrays.asList(1,2,3,4,4,4,5)
            // Arrays.asList(5,4,3,2,2,2,1)
            Arrays.asList(1,2,4,3,4,3,7,5,8)
        );

        System.out.println(isMonotonic(list));
    }
}