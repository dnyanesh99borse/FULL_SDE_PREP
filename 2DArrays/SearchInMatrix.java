// public class SearchInMatrix{
//     public static boolean searchMatrix(int[][] arr, int target) {
//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr[0].length; j++){
//                 if(arr[i][j] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         // int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//         int[][] arr = {{-1,3}};

//         int target = 3;
//         System.out.println(searchMatrix(arr,target));
//     }
// }


//-------------------------------SECOND APPROACH----------------------
public class SearchInMatrix{
    public static boolean searchMatrix(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1; //last cell or last column value; //it is traversing from back side
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return true;
            }else if(target < arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        // int[][] arr = {{-1,3}};

        int target = 3;
        System.out.println(searchMatrix(arr,target));
    }
}