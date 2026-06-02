
import java.util.*;
public class twoDArray1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //declaration
        int[][] arr = new int[4][5];

        //how to draw out row and column length from the given 2D Array.
        int row = arr.length;
        int col = arr[0].length;
        // int row = 4;
        // int col = 5;

        //adding element in 2D array
        for(int i=0; i < row; i++){
            for(int j=0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //printing 2D Array
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}