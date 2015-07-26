import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Created by sreedish.ps on 03/05/15.
 */
public class Problem096 {
  static int sum =0;
    static  long counter = 0;
    static int board[][];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("/Users/sreedish.ps/Downloads/sudoku.txt"));
    String line = br.readLine();
    while (line != null) {
      board = new int[9][9];
      if(line.contains("Grid")){
        for(int i = 0;i< 9;i++){
          line = br.readLine();
          for(int j=0;j<9;j++){
            board[i][j] = Integer.parseInt(line.charAt(j)+"");
          }
        }
      }
      print(board);
      solve(board);
      break;
    }

    System.out.println(sum);
  }

  private static void print(int[][] board){
    for(int i =0;i<9;i++){
      for(int j=0;j<9;j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println();
  }

  private static void solve(int[][] board) {
   // print(board);
    if(solved(board))
    {
      print(board);
      sum += 1;
      return;
    }

      for(int i=0;i<9;i++){
          for(int j=0;j<9;j++){
              if(board[i][j] == 0){
                  for(int k =1;k<=10;k++){
                      if(k==10){
                          board[i][j] = 0;
                          return;
                      }
                      if(notInRowCol(board,i,j,k) && notInGrid(board,i,j,k)){
                          board[i][j] = k;
                          solve(board);
                      }
                  }
                  board[i][j] = 0;
              }
          }
      }


  }

    private static boolean notInGrid(int[][] board, int i, int j, int k) {
        int rowstart = (i/3) * 3;
        int colstart = (j/3) * 3;

        for(int row = rowstart ; row <rowstart+3;row++){
            for(int col = colstart;col<colstart+3;col++){
                if(board[row][col] == k){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean notInRowCol(int[][] board, int i,int j, int k) {
        for(int col =0;col<9;col++){
            if(board[i][col] == k){
                 return false;
            }
            if(board[col][j] == k){
                return false;
            }
        }
        return true;
    }

    private static boolean solved(int[][] board) {
         print(board);
        if(counter == 927){
            System.out.println("here");
        }
      System.out.println(counter++);
    //rowcheck
    for(int i=0;i<9;i++){
        boolean row[] = new boolean[9];
     // HashSet row = new HashSet();
      for(int j=0;j<9;j++){
        if(board[i][j] == 0){
          return false;
        }
        if(row[(board[i][j] -1 )]){
          return false;
        }
        row[(board[i][j] -1 )] = true;
      }
    }
    //columncheck
    for(int i=0;i<9;i++){
      HashSet column = new HashSet();
      for(int j=0;j<9;j++){
        if(board[i][j] == 0){
          return false;
        }
        if(column.contains(board[j][i])){
          return false;
        }
        column.add(board[j][i]);
      }

    }
    //3*3 check
    for(int m = 0;m<9;m+=3){
      for(int n = 0;n<9;n+=3){
        HashSet grid = new HashSet();
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
            if(board[m+i][n+j] == 0){
              return false;
            }

            if(grid.contains(board[m+i][n+j])){
              return false;
            }
            grid.add(board[m+i][n+j]);
          }
        }
      }
    }

    return true;
  }
}
