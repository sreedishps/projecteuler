/**
 * Created by sreedish.ps on 04/06/14.
 */
public class MathHelper {

    public static boolean[] primeSieve(int a){
        boolean[] arr = new boolean[a];

        for(int i=0;i<a;i++){
           arr[i] = true;
        }
        arr[0] = arr[1] = false;

        for(int i=0; i<a ;i++){
            if(!arr[i]){
                continue;
            }
            for(int j=i+i;j < a ;j+=i){
                arr[j] = false;
            }
        }

        return arr;
    }
    public static boolean checkPrime(int i) {
        if(i < 0){
            return false;
        }
        if(i == 4){
            return false;
        }
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
    public static int reverseInt(int i){
        int j=0;
        while(i>0){
            j = (j*10) + (i%10);
            i = i/10;
        }
        return j;
    }

    public static int HCF(int a, int b) {
        int hcf = 1;
        for(int i=2;i<=Math.min(a,b);i++){
            while((a % i == 0) && ( b % i == 0)){
                hcf *=i;
                a = a/i;
                b=b/i;
            }
        }
        return hcf;
    }
}
