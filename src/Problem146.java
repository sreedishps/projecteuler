/**
 * Created by sreedish.ps on 02/02/15.
 */
public class Problem146 {
  public static void main(String[] args) {
      long sum = 0;
    long counter = 0;
    for(long i =2; i<=1000000;i+=2){
      if((i*i +1) % 3 == 0){
        continue;
      }
      counter++;
    }
    System.out.println(counter);
  }
}
