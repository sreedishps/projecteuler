import java.math.BigInteger;

/**
 * Created by sreedish.ps on 27/09/14.
 */
public class Problem048 {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");
        for(int i=1;i<=1000;i++){
            sum = sum.add((new BigInteger(i+"")).pow(i));
           sum =  sum.mod(new BigInteger("10000000000"));
        }
        System.out.println(sum);
    }
}
