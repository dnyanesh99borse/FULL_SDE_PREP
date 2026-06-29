import java.util.*;
public class IndianCoins{
    public static void main(String[] args){
        //keep in mind the comparator only works with object hence our array should be of Object type
        Integer[] notes = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int value = 121;

        Arrays.sort(notes, Comparator.reverseOrder());

        int minnotes = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<notes.length; i++){
            if(notes[i] <= value){
                while(notes[i] <= value){
                    value -= notes[i];
                    minnotes++;
                    list.add(notes[i]);
                }
            }
        }

        System.out.println("minimum notes required are: "+ minnotes);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}