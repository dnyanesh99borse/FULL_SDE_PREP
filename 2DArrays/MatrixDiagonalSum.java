// public class MatrixDiagonalSum{
//     public static void MatrixDiagonalSum(int[][] arr){
//         int startrow = 0;
//         int startcol = 0;
//         int endrow = arr.length - 1; //2 (0,1,2)
//         int endcol = arr[0].length - 1; //2 (0,1,2)
//         int sum = 0;

//         while(startrow <= endrow && startcol <= endcol){
//             for(int j = startcol; j <= endcol; j++){
//                 int cal = 0;
//                 if(startrow == endrow || startcol == endcol){
//                     cal = arr[startrow][startcol];
//                 }else{
//                     cal = arr[startrow][startcol] +arr[endrow][endcol]+ arr[startrow][endcol] + arr[endrow][startcol];
//                 }
//                 sum += cal;
//                 System.out.print(cal + " ");
//                 break;
//             }
//             startrow++;
//             startcol++;
//             endrow--;
//             endcol--;
//         }
        
//         System.out.println(sum + " ");
//     }
//     public static void main(String[] args){
//         int[][] arr = {
//             {1,1,1,1},
//             {1,1,1,1},
//             {1,1,1,1},
//             {1,1,1,1}
//         };
//         // int[][] arr = {
//         //     {1,2,3},
//         //     {4,5,6},
//         //     {7,8,9}
//         // };
//         MatrixDiagonalSum(arr);
//     }
// }



//-------------APPROACH TWO---------------------
// public class MatrixDiagonalSum{
//     public static void MatrixDiagonalSum(int[][] arr){
//         int sum = 0;
//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr[0].length; j++){
//                 if(i == j){
//                     sum += arr[i][j];
//                 }else if(i + j == arr.length - 1){
//                     sum += arr[i][j];
//                 }
//             }
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args){
//         int[][] arr = {
//             {1,1,1,1},
//             {1,1,1,1},
//             {1,1,1,1},
//             {1,1,1,1}
//         };
//         // int[][] arr = {
//         //     {1,2,3},
//         //     {4,5,6},
//         //     {7,8,9}
//         // };
//         MatrixDiagonalSum(arr);
//     }
// }



//-----------------------FULLY OPTIMIZED CODE-----------------------
public class MatrixDiagonalSum{
    public static void MatrixDiagonalSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            //primary diagonal
            sum += arr[i][i];

            //secondary diagonal
            if(i != arr.length -1-i){
                //accessing sd element using i only and avoiding the overlapping element twice.
                sum += arr[i][arr.length-i-1];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[][] arr = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        MatrixDiagonalSum(arr);
    }
}