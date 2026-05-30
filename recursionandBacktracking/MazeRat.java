
// import java.util.*;
// public class MazeRat{
//     public static void MazeRat(int[][] maze, int n, int r, int c, List<String> ans, String path,boolean[][] vis){
//         //all the boundary conditions & 0 value cell & true in visited array, simply return
//         if(r < 0 || c < 0 || r >= n ||  c >= n || maze[r][c] == 0 || vis[r][c] == true){
//             return;
//         }
//         //if we reach to last cell that is target. Again backtrack & return to find new way.
//         if(r == n - 1 && c == n - 1){
//             ans.add(path);
//             System.out.println(ans);
//             return;
//         }
        
//         //before going for the next step first make the current step as true;
//         vis[r][c] = true;
        
//         MazeRat(maze, n, r + 1, c, ans, path + "D",vis);
//         MazeRat(maze, n, r - 1, c, ans, path + "U",vis);
//         MazeRat(maze, n, r, c - 1, ans, path + "L",vis);
//         MazeRat(maze, n, r, c + 1, ans, path + "R",vis);

//         vis[r][c] = false;
//         //after returing back or BACKTRACKING it is also necessary to make that vis values again false
//         //while backtracking one by one. so that the another path which is there could use the same cells
//         //otherwise the whole functioning will stop there itself due to all true and 0 values no values to move.
//     }

//     public static void main(String[] args){
//         // int[][] maze = {{1,0}, {1,1}};
//         int[][] maze = {{1,0,0,0}, {1,1,0,1}, {1,1,0,0}, {0,1,1,1}};
//         int n = maze.length;
//         boolean[][] vis = new boolean[n][n];
//         MazeRat(maze, n, 0, 0, new ArrayList<>(),"",vis);
//     }
// }


//-----HERE IN THE ABOVE APPROACH WOULD BE INEFFICIENT SOLUTION FOR US, AS WE ARE USING EXTRA SPACE AND OPERATIONS LIKE OF VISITING ARRAY AND ALL
//-----SO IT CAN BE REDUCED
    //insted of making new array to track in the original array itself,
    //if the cell is visited make it's value = -1
    //and after backtracking again make the values of that cell = 1
    //as per our logic and approach.
    //and in one base case also, check if maze[r][c] == -1 return;
//------THUS SAME CODE WITH MINOR CHANGES.



import java.util.*;
public class MazeRat{
    public static void MazeRat(int[][] maze, int n, int r, int c, List<String> ans, String path){
        //all the boundary conditions & 0 value cell & true in visited array, simply return
        if(r < 0 || c < 0 || r >= n ||  c >= n || maze[r][c] == 0 || maze[r][c] == -1){
            return;
        }
        //if we reach to last cell that is target. Again backtrack & return to find new way.
        if(r == n - 1 && c == n - 1){
            ans.add(path);
            System.out.println(ans);
            return;
        }
        
        //before going for the next step first make the current step as true;
        maze[r][c] = -1;
        
        MazeRat(maze, n, r + 1, c, ans, path + "D");
        MazeRat(maze, n, r - 1, c, ans, path + "U");
        MazeRat(maze, n, r, c - 1, ans, path + "L");
        MazeRat(maze, n, r, c + 1, ans, path + "R");

        maze[r][c] = 1;
        //after returing back or BACKTRACKING it is also necessary to make that vis values again false
        //while backtracking one by one. so that the another path which is there could use the same cells
        //otherwise the whole functioning will stop there itself due to all true and 0 values no values to move.
    }

    public static void main(String[] args){
        // int[][] maze = {{1,0}, {1,1}};
        int[][] maze = {{1,0,0,0}, {1,1,0,1}, {1,1,0,0}, {0,1,1,1}};
        int n = maze.length;
        MazeRat(maze, n, 0, 0, new ArrayList<>(),"");
    }
}