
import java.util.*;
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