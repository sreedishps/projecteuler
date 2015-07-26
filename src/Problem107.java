import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem107 {
  public static void main(String[] args) throws IOException {
    int m;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    m = Integer.parseInt(br.readLine());

    int arr[][] = new int[m][m];
    int  spt[][] = new int[m][m];

    int counter = 0;

    for(int i=0;i<m;i++){
      String temp = br.readLine();
      String[] splitted = temp.split(",");
      for(int j=0;j<m;j++){
        spt[i][j] = -1;
        if(splitted[j].equals("-")){
          arr[i][j] = -1;
          continue;
        }
        arr[i][j] = Integer.parseInt(splitted[j]);
      }
    }




    Integer savings = 0;
    while(true){
      int minI = -1;
      int minJ = -1;
      int minEdge = Integer.MAX_VALUE;

      //find minimum edge
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < m; j++) {
               if(arr[i][j] != -1 && arr[i][j] < minEdge){
                 minEdge = arr[i][j];
                 minI =i;
                 minJ =j;
               }
        }
      }

      if(minI == -1 && minJ == -1){
        System.out.println("Saving =  "+savings);
        break;
      }

      //try to add minimum edge to spanning tree
      spt[minI][minJ] = minEdge;
      spt[minJ][minI] = minEdge;
      arr[minI][minJ] = -1;
      arr[minJ][minI] = -1;
      counter++;
      System.out.println("Counter " + counter + " for edge " + minEdge);

      boolean cycle = false;


      if (findCycle(spt,m,minI)) {
        spt[minI][minJ] = -1;
        spt[minJ][minI] = -1;
        savings += minEdge;
        counter--;
      }

    }

    System.out.println("Counter "+counter);

  }

  private static boolean findCycle(int[][] arr,int nodes,int startnode) {
    Set<Integer> visited = new HashSet<Integer>() ;
    return dfsModified(arr,nodes,visited,-1,startnode);
  }

  private static boolean dfsModified(int[][] arr, int nodes, Set<Integer> visited, int parent, int node) {
    if(visited.size() == nodes){
      return false;
    }
    for (int i = 0; i < nodes; i++) {
      if (visited.contains(i) && i != parent && i != node && arr[node][i] != -1) {
        System.out.println("Found cycle "+i+" to "+node);
        return true;
      }
    }
    visited.add(node);
    System.out.println(" " + node);
    for (int i = 0; i < nodes; i++) {
      if (!visited.contains(i) && arr[node][i] != -1 && i !=node) {
        if(dfsModified(arr, nodes, visited, node, i)){
          return true;
        }
      }
    }
    return false;
  }
}
