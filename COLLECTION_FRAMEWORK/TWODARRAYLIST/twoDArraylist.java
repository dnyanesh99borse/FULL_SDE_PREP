
import java.util.*;
public class twoDArraylist{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        // //list 1 
        // //one of the way of adding elements in the ArrayList.
        // ArrayList<Integer> list = new ArrayList<>(
        //     Arrays.asList(10,20)
        // );
        // mainlist.add(list);

        // //list 2
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(30); list2.add(40);
        // mainlist.add(list2);

        // for(int i = 0; i < mainlist.size(); i++){
        //     ArrayList<Integer> currlist = mainlist.get(i);

        //     for(int j = 0; j < currlist.size(); j++){
        //         System.out.print(currlist.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i =  1; i <= 5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        //its also valid
        list2.remove(1);
        list2.remove(2);
        
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);
    }
}