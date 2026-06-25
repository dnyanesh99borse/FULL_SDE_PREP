import java.util.*;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base Case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        // Base Case
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        // Reverse first
        reverseStack(s);

        // Then print
        System.out.println("Reversed Stack:");
        printStack(s);
    }
}