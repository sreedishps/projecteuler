import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by sreedish.ps on 17/01/15.
 */
public class Problem054 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("/Users/sreedish.ps/p054_poker.txt"));
    String line = br.readLine();
    int counter = 0,p1=0,p2=0;
    int minRank = 15;

    while (line != null) {

      String player1 = line.substring(0,14);
      String player2 = line.substring(15,29);

      int rank1 = getRank(player1);
      int rank2 = getRank(player2);

//      if((rank1 == 10) && (rank2 == 10)){
//           rank1 = highest(player1);
//           rank2 = highest(player2);
//      }

      if(rank1 != rank2){
       // System.out.println(player1);
      //  System.out.println(player2);
        if( rank1<rank2 ) {
          p1++;
        }else if(rank1 > rank2){
          p2++;
        }
      }
      //else if((rank1 == 8 )&& (rank2 == 8)){
//
//        rank1 = getMaxValuePair(player1);
//        rank2 = getMaxValuePair(player2);
//
//        if( rank1<rank2 ) {
//          p1++;
//        }else{
//          p2++;
//        }
//
//      }
      else{

        if((rank1 == 8 )&& (rank2 == 8)){
          rank1 = getMaxValuePair(player1);
          rank2 = getMaxValuePair(player2);

          if( rank1>rank2 ) {
            p1++;
          }else if(rank1 < rank2){
            p2++;
          }

        }else if((rank1 == 10 )&& (rank2 == 10)){
          rank1 = highest(player1);
          rank2 = highest(player2);
          if( rank1>rank2 ) {
            p1++;
          }else if(rank1 < rank2){
            p2++;
          }
        }
        else{
          if(minRank > rank1){
            minRank = rank1;
          }
          counter++;
        }

      }
      line = br.readLine();
    }

    System.out.println("Remaining "+counter);
    System.out.println("Player1 "+p1);
    System.out.println("Player2 "+p2);
    System.out.println("minimum tie "+minRank);
  }

  private static int highest(String str) {
    if(str.contains("A")){
      return 14;
    }
    if(str.contains("K")){
      return 13;
    }
    if(str.contains("Q")){
      return 12;
    }
    if(str.contains("J")){
      return 11;
    }
    if(str.contains("T")){
      return 10;
    }
    if(str.contains("9")){
      return 9;
    }
    if(str.contains("8")){
      return 8;
    }
    if(str.contains("7")){
      return 7;
    }
    if(str.contains("6")){
      return 6;
    }
    if(str.contains("5")){
      return 5;
    }
    if(str.contains("4")){
      return 4;
    }
    if(str.contains("3")){
      return 3;
    }
    if(str.contains("2")){
      return 2;
    }
    return 0;

  }

  private static int getRank(String str) {
    if(royalFlush(str)){
      return 0;
    }else if(straightFlush(str)){
      return 1;
    }else if(fourOfAKind(str)){
      System.out.println("Four of a kind");
      return 2;
    } else if(fullHouse(str)){
      return 3;
    } else if(flush(str)) {
     // System.out.println("Flush "+str);
      return 4;
    }
     else if(straight(str)){
     // System.out.println("Straight " + str);
      return 5;
   } else if(threeOfAKind(str)){
     // System.out.println(str);
        return 6;
    } else if(twoPairs(str)){
     // System.out.println(str);
      return 7;
    } else if(onePair(str)){
     // System.out.println(str);
      return 8;
    }
    return 10;
  }

  private static boolean onePair(String str) {
    return (getMaxValueCount(str) == 2)?true:false;
  }

  private static boolean twoPairs(String str) {
    if(getMaxValueCount(str) == 2){
      for(int i=0;i<=12;i+=3){
        char suit = str.charAt(i);
        for(int j=i+3;j<=12;j+=3){
          if(str.charAt(j) == suit){
            String temp  = str.replaceFirst(suit + "", '0' + "");
            return (getMaxValueCount(temp) == 2)?true:false;
          }
        }
      }
    }
    return false;
  }

  private static boolean threeOfAKind(String str) {
    return (getMaxValueCount(str) == 3)?true:false;
  }

  private static boolean straight(String str) {
    Integer arr[] = new Integer[5];

    for(int i=0;i<=12;i+=3){
     if(str.charAt(i) == 'T'){
          arr[i/3] = 10;
     }
      else if(str.charAt(i) == 'J'){
        arr[i/3] = 11;
      }
    else  if(str.charAt(i) == 'Q'){
        arr[i/3] = 12;
      }
     else if(str.charAt(i) == 'K'){
        arr[i/3] = 13;
      }
     else if(str.charAt(i) == 'A'){
        arr[i/3] = 14;
      }
      else{
       arr[i/3] = Integer.parseInt(str.charAt(i)+"");
     }

    }

    Arrays.sort(arr);

    return incremental(arr);


  }

  private static boolean incremental(Integer[] arr) {

    for(int i=0;i<4;i++){
      if(arr[i+1] - arr[i] != 1){
        return false;
      }
    }
    return true;
  }

  private static boolean flush(String str) {
    return (getMaxSuitCount(str)==5)?true:false;
  }

  private static boolean fullHouse(String str) {
    if(getMaxValueCount(str)==3){
      if(valuePair(str)){
        return true;
      }
    }
      return false;
  }

  private static boolean valuePair(String str) {
    for(int i=0;i<=12;i+=3){
      char suit = str.charAt(i);
      int counter =0;
      for(int j=0;j<=12;j+=3){
        if(str.charAt(j) == suit){
          counter++;
        }
      }
      if(counter == 2){
        return true;
      }
    }
    return false;
  }

  private static boolean fourOfAKind(String str) {
    return (getMaxValueCount(str)==4)?true:false;
  }

  private static int getMaxSuitCount(String str) {
    int max = 0;
    for(int i=1;i<=13;i+=3){
      char suit = str.charAt(i);
      int counter =0;
      for(int j=1;j<=13;j+=3){
        if(str.charAt(j) == suit){
          counter++;
        }
      }
      if(counter > max){
        max = counter;
      }
    }
    return max;
  }

  private static int getMaxValueCount(String str) {
    int max = 0;
    for(int i=0;i<=12;i+=3){
      char suit = str.charAt(i);
      int counter =0;
      for(int j=0;j<=12;j+=3){
        if(str.charAt(j) == suit){
          counter++;
        }
      }
      if(counter > max){
        max = counter;
      }
    }
    return max;
  }
  private static int getMaxValuePair(String str) {
    int max = 0;

    int maxvalue = 0;
    for(int i=0;i<=12;i+=3){
      char suit = str.charAt(i);
      int counter =0;
      for(int j=0;j<=12;j+=3){
        if(str.charAt(j) == suit){
          counter++;
        }
      }
      if(counter > max){
        max = counter;
        if(str.charAt(i) == 'T'){
          maxvalue = 10;
        }
        else if(str.charAt(i) == 'J'){
          maxvalue = 11;
        }
        else  if(str.charAt(i) == 'Q'){
          maxvalue = 12;
        }
        else if(str.charAt(i) == 'K'){
          maxvalue = 13;
        }
        else if(str.charAt(i) == 'A'){
          maxvalue = 14;
        }
        else{
          maxvalue = Integer.parseInt(str.charAt(i)+"");
        }
      }
    }
    return maxvalue;
  }

  private static boolean straightFlush(String str) {
    return false;
  }

  private static boolean royalFlush(String str) {
    return false;
  }

  private static boolean sameSuit(String str) {

    char suit = str.charAt(1);
    boolean answer = true;

    for(int i=4;i<=13;i+=3){
      answer = answer && (str.charAt(i) == suit);
    }
    return answer;
  }
}
