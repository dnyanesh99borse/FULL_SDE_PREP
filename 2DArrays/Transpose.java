public class Transpose{
    public static int[][] Transpose(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] ans = new int[col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},{4,5,6},{7,8,9}
        };

        int[][] ans = Transpose(arr);
        for(int i=0; i<ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}