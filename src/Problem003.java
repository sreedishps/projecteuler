/**
 * Created by sreedish.ps on 04/06/14.
 * Largest prime factor
 */
public class Problem003 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(largestPrimeFactor(600851475143L));
        System.out.println("Time taken (in ms)= "+
                (System.nanoTime() - startTime) / 1E6);

        startTime = System.nanoTime();
        System.out.println(largestPrimeFactorBetter(600851475143L));
        System.out.println("Time taken (in ms)= "+
                (System.nanoTime() - startTime) / 1E6);

        startTime = System.nanoTime();
        System.out.println(largestPrimeFactorBetterBetter(600851475143L));
        System.out.println("Time taken (in ms)= "+
                (System.nanoTime() - startTime) / 1E6);
    }

    private static long largestPrimeFactor(long num) {
        long i = (long) Math.sqrt(num);

        while (i > 2) {
            if (num % i == 0) {
                if (MathHelper.checkPrime(i)) {
                    return i;
                }
            }
            i--;
        }

        return 0;
    }

    private static long largestPrimeFactorBetter(long num) {
        long factor = 2;
        long lastfactor = 1;

        while (num > 1) {
            if(num % factor ==0){
                lastfactor = factor;
                while(num%factor == 0){
                    num/=factor;
                }
            }
            factor++;
        }

        return lastfactor;
    }
    private static long largestPrimeFactorBetterBetter(long num) {
        long factor = 3;
        long lastfactor = 2;

        while(num%2 == 0 && num > 1) {
            num /= factor;
        }


        while (num > 1) {
            if(num % factor ==0){
                lastfactor = factor;
                while(num%factor == 0){
                    num/=factor;
                }
            }
            factor+=2;
        }

        return lastfactor;
    }

}

