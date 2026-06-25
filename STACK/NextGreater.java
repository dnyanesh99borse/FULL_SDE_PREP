
import java.util.*;
public class NextGreater{
    public static void nextGreater(int[] arr, int[] nextgreater){
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i >= 0; i--){
            //here we have stored the idx of element in stack and hence using idx accessing or seeing the elements..
            //getting stored index from the stack and look for its respective element in the arr.
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextgreater[i] = -1;
            }else{
                nextgreater[i] = arr[s.peek()]; //peek index ke element ko store karo
            }

            //push element's index in stack
            s.push(i);
        }
    }
    public static void main(String[] args){
        int[] arr = {6,8,0,1,3};
        int[] nextgreater = new int[arr.length];
        
        nextGreater(arr, nextgreater);

        for(int i = 0; i < nextgreater.length; i++){
            System.out.print(nextgreater[i] + " ");
        }
    }
}

//USING THIS LOGIC AND CODE JUST BY VERY MINOR CHANGES YOU CAN ALSO SOLVE:
/*1. next Greater Right
  2. next Greater Left
  3. next Smaller Right
  4. next Smaller Left */