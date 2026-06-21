
// import java.util.*;
public class MergeSortLL{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    //----------PRINT-----------------------------
    public void print() {
        //if linkedlist is Empty
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //-----------------GET MID---------------------
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow is my mid
    }
    //-----------------MERGE---------------------
    private Node merge(Node head1, Node head2){
        //new LL
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next; //move head to next element
                temp = temp.next; //move temp pointer to next node
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next; 
            }
        }
        //for remaining elements for LEFTHALF
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            //for remaining elements for RIGHTHALF
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        //remove first useless node
        mergedLL = mergedLL.next;
        return mergedLL;
    }
    //--------------MAIN MERGE SORT--------------------
    public Node mergeSort(Node head){
        //Base Case
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge and return
        return merge(newLeft, newRight);
    }

    public static void main(String[] args){

    MergeSortLL ll = new MergeSortLL();

    head = new Node(4);
    head.next = new Node(3);
    head.next.next = new Node(2);
    head.next.next.next = new Node(1);
    //before sorting: 1->2->3->4
    //after sorting: 4->3->2->1
    head = ll.mergeSort(head);

    ll.print();
}
}


//-------------------SAME SOLUTION USING JCF's LinkedList<INTEGER> ----------------------
// import java.util.LinkedList;

// public class MergeSortJCF {

//     // ---------------- MERGE SORT ----------------
//     public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {

//         // Base Case
//         if (list.size() <= 1) {
//             return list;
//         }

//         // Find Mid
//         int mid = list.size() / 2;

//         // Create Left Half
//         LinkedList<Integer> left = new LinkedList<>();
//         for (int i = 0; i < mid; i++) {
//             left.add(list.get(i));
//         }

//         // Create Right Half
//         LinkedList<Integer> right = new LinkedList<>();
//         for (int i = mid; i < list.size(); i++) {
//             right.add(list.get(i));
//         }

//         // Recursively Sort Both Halves
//         LinkedList<Integer> sortedLeft = mergeSort(left);
//         LinkedList<Integer> sortedRight = mergeSort(right);

//         // Merge and Return
//         return merge(sortedLeft, sortedRight);
//     }

//     // ---------------- MERGE ----------------
//     public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {

//         LinkedList<Integer> result = new LinkedList<>();

//         int i = 0;
//         int j = 0;

//         // Compare elements from both lists
//         while (i < left.size() && j < right.size()) {

//             if (left.get(i) <= right.get(j)) {
//                 result.add(left.get(i));
//                 i++;
//             } else {
//                 result.add(right.get(j));
//                 j++;
//             }
//         }

//         // Remaining Left Elements
//         while (i < left.size()) {
//             result.add(left.get(i));
//             i++;
//         }

//         // Remaining Right Elements
//         while (j < right.size()) {
//             result.add(right.get(j));
//             j++;
//         }

//         return result;
//     }

//     // ---------------- MAIN ----------------
//     public static void main(String[] args) {

//         LinkedList<Integer> list = new LinkedList<>();

//         list.add(4);
//         list.add(3);
//         list.add(2);
//         list.add(1);

//         System.out.println("Original List : " + list);

//         list = mergeSort(list);

//         System.out.println("Sorted List   : " + list);
//     }
// }