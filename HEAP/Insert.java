import java.util.*;

public class Insert {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public ArrayList<Integer> add(int data) {

            // Step 1: Add element at the end
            arr.add(data);

            // Step 2: Heapify Up
            int child = arr.size() - 1;
            int par = (child - 1) / 2;

            // Compare child with parent
            while (child > 0 && arr.get(child) < arr.get(par)) {

                // Swap
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);

                // Move upward
                child = par;
                par = (child - 1) / 2;
            }

            return arr;
        }

        public int peek(){
            return arr.get(0); //return 0th index -> first element as it is min Heap
        }
    }

    public static void main(String[] args) {

        Heap heap = new Heap();

        System.out.println(heap.add(2));
        System.out.println(heap.add(3));
        System.out.println(heap.add(4));
        System.out.println(heap.add(5));
        System.out.println(heap.add(10));
        System.out.println(heap.add(1));

        System.out.print("Peek: "+ heap.peek());
    }
}