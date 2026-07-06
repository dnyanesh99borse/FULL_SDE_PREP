import java.util.*;

public class HeapOperations {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        //--------------CHECK ISEMPTY()---------------------
        public boolean isEmpty() {
            return arr.size() == 0;
        }

        //------------ADD--------------------------------
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

        //------------PEEK--------------------------------
        public int peek() {
            return arr.get(0); // Root of Min Heap
        }

        //--------------HEAPIFY-------------------
        private void heapify(int i) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            // Check left child
            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }

            // Check right child
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            // If root is not smallest
            if (minIdx != i) {

                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // Heapify the affected subtree
                heapify(minIdx);
            }
        }

        //--------------DELETE FROM HEAP--------------------------------
        public int remove() {

            // Store the minimum value
            int data = arr.get(0);

            // Step 1: Swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2: Remove last element
            arr.remove(arr.size() - 1);

            // Step 3: Heapify from root
            if (!arr.isEmpty()) {
                heapify(0);
            }

            return data;
        }
    }

    public static void main(String[] args) {

        Heap heap = new Heap();

        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);

        while (!heap.isEmpty()) {
            System.out.print(heap.peek() + " ");
            heap.remove();
        }
    }
}