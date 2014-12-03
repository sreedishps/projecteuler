import java.math.BigInteger;

/**
 * Created by sreedish.ps on 28/09/14.
 */
public class Problem056 {
    public static void main(String[] args) {
        int sum =0;
        for(int i = 99;i>1;i--){
            for(int j=99;j>1;j--){
               if( MathHelper.sumOfDigits(new BigInteger(i+"").pow(j)) > sum ){
                   sum = MathHelper.sumOfDigits(new BigInteger(i+"").pow(j));
                   System.out.println(sum);
               }
            }
        }
    }

}
