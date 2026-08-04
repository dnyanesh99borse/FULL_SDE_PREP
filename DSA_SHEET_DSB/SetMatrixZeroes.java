public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix){
        int n = matrix.length;
        int toprow = 0;
        int bottomrow = n-1;
        int leftcol = 0;
        int rightcol = n-1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    //top
                    int top = i;
                    while(top >= toprow){
                        matrix[top][j] = 9;
                        top--;
                    }

                    //bottom
                    int bottom = i;
                    while(bottom <= bottomrow){
                        matrix[bottom][j] = 9;
                        bottom++;
                    }

                    //left
                    int left = j;
                    while(left >= leftcol){
                        matrix[i][left] = 9;
                        left--;
                    }

                    //right
                    int right = j;
                    while(right <= rightcol){
                        matrix[i][right] = 9;
                        right++;
                    }

                    break; // to start after changes in respective row and column
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 9){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        setZeroes(matrix);

        //print
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
