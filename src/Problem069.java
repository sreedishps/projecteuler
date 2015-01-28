import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by sreedish.ps on 21/01/15.
 */
public class Problem069 {
  static boolean sieve[];
  public static void main(String[] args) {
   sieve = MathHelper.primeSieve(1000000);
    Double max  = 0.0;
    int answer = 0;

    for(int i=2;i<=1000000;i+=2){
     HashSet<Integer> factors = findFactors(i);
      Double now = (double)i /(double) totientFunction(i,factors);
      if(now > max){
        max = now;
        answer = i;
      }
    }

    System.out.println(answer);
  }

  private static Long totientFunction(int i, HashSet<Integer> factors) {
    Long numerator  = new Long(i+"");
    Iterator<Integer> itr = factors.iterator();
    while(itr.hasNext()){
      numerator = numerator * (itr.next()-1);
    }
    Iterator<Integer> itr2 = factors.iterator();
    while(itr2.hasNext()){
      numerator = numerator / (itr2.next());
    }
    return numerator;
  }

  private static HashSet<Integer> findFactors(int i) {
    HashSet<Integer> factors = new HashSet<Integer>();
    int j =2;
    while(i>1){
      while(!sieve[j]){
        j++;
      }

      while(i%j == 0){
        factors.add(j);
        i = i/j;
      }
      j++;
    }
    return factors;
  }
}
