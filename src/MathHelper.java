/**
 * Created by sreedish.ps on 04/06/14.
 */
public class MathHelper {
    public static boolean checkPrime(int i) {
        for(int j=(i/2);j>2;j--){
            if(i%j == 0)
                return false;
        }
        return true;
    }
    public static boolean checkPrime(long i) {
        for(long j=(i/2);j>2;j--){
            if(i%j == 0)
                return false;
        }
        return true;
    }
}
