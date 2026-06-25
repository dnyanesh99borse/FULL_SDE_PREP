import java.util.*;
public class PushatBottom{
    public static void pushBottom(Stack<Integer> s, int data){
        //when stack will be empty
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();      //store our curr/top element and go to next 
        pushBottom(s, data);  /*ask next to store its next element and so on till array will not empty
                              and then once array will be empty insert data*/

        s.push(top);          /*and then this line will start executing. then from top insert one after another 
                              /element back to the stack */ 
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}