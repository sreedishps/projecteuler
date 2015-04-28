import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sreedish.ps on 12/04/15.
 */
public class Problem206 {
  public static void main(String[] args) {
    Integer counter =0;
    BigInteger start = new BigInteger("1000000000");
    String pattern = "1.2.3.4.5.6.7.8.9.0";
    Pattern r = Pattern.compile(pattern);

    while (true){
      start = start.add(BigInteger.TEN);
      BigInteger answer = start.multiply(start);
     // System.out.println(answer + " "+answer.toString().length());
      if(answer.toString().length() == 20){
        counter++;
        break;
      }
      Matcher m = r.matcher(answer.toString());
      if(m.matches()){
        System.out.println(start+" "+answer.toString());
        break;
      }
    }
    System.out.println(counter);
  }
}
