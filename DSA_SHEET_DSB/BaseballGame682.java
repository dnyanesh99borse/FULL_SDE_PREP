import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BaseballGame682 {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < operations.length; i++){

            if(operations[i].equals("C")){
                int out = stack.pop();
            }else if(operations[i].equals("D")){
                stack.push(2 * stack.peek()); //2 * peek
            }else if(operations[i].equals("+")){
                int temp = stack.pop();
                int sum = temp + stack.peek();
                stack.push(temp);
                stack.push(sum);
            }else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int total = 0;
        while (!stack.isEmpty()) {
            total += stack.pop();
        }

        return total;
    }

    public static void main(String[] args){
        String[] ops = {"5", "2", "C", "D", "+"};

        System.out.println("Output: "+ calPoints(ops));
    }
}
