import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by sreedish.ps on 28/04/15.
 */
public class Problem124 {
  public static void main(String[] args) {
    int limit = 100000;
    long sieve[][] = new long[limit+1][2];

    sieve[0][0] = 0;
    for(int i=1;i<= limit ; i++){
      sieve[i][0] = 1;
      sieve[i][1] = i;
    }

    for(int i=2;i<= limit;i++){
      if(sieve[i][0] == 1){
        for (int j= i ; j<=limit ;j = j+i){
          sieve[j][0] = sieve[j][0] * i;
        }
      }
    }

    Arrays.sort(sieve, new Comparator<long[]>() {
      @Override
      public int compare(long[] o1, long[] o2) {
        Long one = o1[0];
        Long two = o2[0];
        return one.compareTo(two);
      }
    });

    System.out.println(sieve[10000][1]);
  }
}
