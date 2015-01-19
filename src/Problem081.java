import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sreedish.ps on 20/01/15.
 */
public class Problem081 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("/Users/sreedish.ps/p081_matrix.txt"));
    Integer originalCost[][] = new Integer[80][80];
    int row = 0;
    String line = br.readLine();
    while (line != null) {
      for(int i=0;i<80;i++){
        originalCost[row][i] = Integer.parseInt(line.split(",")[i]);
      }
      row++;
      line = br.readLine();
    }


    for(int i=1;i<80;i++){
      originalCost[0][i] = originalCost[0][i-1] + originalCost[0][i];
      originalCost[i][0] = originalCost[i-1][0] + originalCost[i][0];
    }

    for(int i=1;i<80;i++){
      for(int j=1;j<80;j++){
        originalCost[i][j] = Math.min(originalCost[i-1][j],originalCost[i][j-1]) + originalCost[i][j];
      }
    }

//    for(int i =0;i<80;i++){
//      for(int j=0;j<80;j++){
//        System.out.print(originalCost[i][j]+" ");
//      }
//      System.out.println();
//    }

    System.out.println(originalCost[79][79]);
  }
}
