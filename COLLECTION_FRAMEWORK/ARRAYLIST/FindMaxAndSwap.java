
import java.util.*;
public class FindMaxAndSwap{
    //----method to swap two elements------------------
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        for(int x : list){
            System.out.print(x + " ");
        }
    }

    //----method to find the maximum element-----------
    public static int Max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        return max;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(10,20,30,40,50)
        );

        System.out.println(Max(list));
        
        int idx1 = 1;
        int idx2 = 3;
        swap(list, idx1, idx2); //10,40,30,20,50
    }
}