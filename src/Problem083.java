import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by sreedish.ps on 22/09/14.
 */
public class Problem083 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("/Users/sreedish.ps/Experiments/p083_matrix.txt"));
        int arr[][] = new int[80][80];
        int row =0;
        while (in.hasNext()) {
            String str = in.next();

            for(int i=0;i<80;i++){
                arr[row][i] = Integer.parseInt(str.split(",")[i]);
            }
            row++;
        }

        boolean visit[][] = new boolean[80][80];
        int weight[][] = new int[80][80];
        for(int i=0;i<80;i++){
            for(int j=0;j<80;j++) {
                visit[i][j] = false;
                weight[i][j] = 100000000;
            }
        }

        //Dijkstra Algorithm

        weight[0][0] = arr[0][0];

        int curi=0,curj=0;

        while(!visit[79][79]){

            //get current node
            int max = 100000000;

            for(int i=0;i<80;i++){
                for(int j=0;j<80;j++) {
                    if((weight[i][j] < max) && (visit[i][j] == false)){
                        max = weight[i][j];
                        curi = i;
                        curj = j;
                    }
                }
            }

            //calculate adjacent unvisited vertex costs
            //top
            if(curi > 0 && !visit[curi-1][curj]){
                if(weight[curi][curj] + arr[curi-1][curj] < weight[curi - 1][curj]){
                    weight[curi - 1][curj] = weight[curi][curj] + arr[curi-1][curj] ;
                }
            }
            //bottom
            if(curi < 79 && !visit[curi+1][curj]){
                if(weight[curi][curj] + arr[curi+1][curj] < weight[curi + 1][curj]){
                    weight[curi + 1][curj] = weight[curi][curj] + arr[curi + 1][curj] ;
                }
            }
            //left
            if(curj > 0 && !visit[curi][curj-1]){
                if(weight[curi][curj] + arr[curi][curj-1] < weight[curi][curj-1]){
                    weight[curi ][curj-1] = weight[curi][curj] + arr[curi][curj-1] ;
                }
            }

            //right
            if(curj < 79 && !visit[curi][curj+1]){
                if(weight[curi][curj] + arr[curi][curj+1] < weight[curi][curj+1]){
                    weight[curi ][curj+1] = weight[curi][curj] + arr[curi][curj+1] ;
                }
            }

            //mark current node visited
            visit[curi][curj] = true;
        }

        System.out.println(weight[79][79]);
    }
}
