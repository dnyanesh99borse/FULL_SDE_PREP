import java.util.*;
public class MinAbsoluteDiff{
    public static void main(String[] args){
        // int[] A = {1,2,3};
        // int[] B = {2,1,3};
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5};
        int sum = 0;

        //sort descending
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length; i++){
            int mindiff = Math.abs(A[i] - B[i]);
            sum += mindiff;
        }
        System.out.println("sum of Min. absolute diff. is: " + sum);
    }
}