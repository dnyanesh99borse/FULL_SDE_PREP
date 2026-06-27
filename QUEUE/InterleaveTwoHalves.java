
import java.util.*;
public class InterleaveTwoHalves{
    public static Queue interleave(Queue<Integer> q){
        Queue<Integer> firsthalf = new LinkedList<>();
        int size = q.size();  //use in this manner only and not like: q.size()/2
                              //cause there the size value will change everytime and can cause error

        //add first half elements to firsthalf
        for(int i = 0; i < size/2; i++){
            firsthalf.add(q.remove());  //firsthalf: 1 2 3 4 5   //q: 6 7 8 9 10
        }

        //interleave
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove()); //1st half's element
            q.add(q.remove()); //2nd half's element from the same queue
        }

        return q;
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        //add 10 elements in QUEUE
        for(int i = 1; i <= 10; i++){
            q.add(i);
        }

        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}