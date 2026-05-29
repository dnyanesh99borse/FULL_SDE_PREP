//----WORD SEARCH--------------
//same approach as the MAZERAT PROBLEM, just some minor changes.
public class LC79 {

    public static boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {

                if(dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean dfs(char[][] board,
                       String word,
                       int r,
                       int c,
                       int index) {

        // all boundary conditions
        if(r < 0 || c < 0 ||
           r >= board.length ||
           c >= board[0].length ||
           board[r][c] != word.charAt(index)) {

            return false;
        }

        // matched entire word
        if(index == word.length() - 1) {
            return true;
        }

        // mark visited
        char temp = board[r][c];
        board[r][c] = '*';

        boolean found =
                dfs(board, word, r + 1, c, index + 1) ||
                dfs(board, word, r - 1, c, index + 1) ||
                dfs(board, word, r, c + 1, index + 1) ||
                dfs(board, word, r, c - 1, index + 1);

        // backtrack
        board[r][c] = temp;

        return found;
    }

    public static void main(String[] args){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}