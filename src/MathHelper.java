import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by sreedish.ps on 04/06/14.
 */
public class MathHelper {

    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }

    public static boolean[] primeSieve(int a) {
        boolean[] arr = new boolean[a];

        for (int i = 0; i < a; i++) {
            arr[i] = true;
        }
        arr[0] = arr[1] = false;

        for (int i = 0; i < a; i++) {
            if (!arr[i]) {
                continue;
            }
            for (int j = i + i; j < a; j += i) {
                arr[j] = false;
            }
        }

        return arr;
    }

    public static boolean checkPrime(int i) {
        if (i < 0) {
            return false;
        }
        if (i == 4) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

    public static boolean checkPrime(long i) {
        if (i < 0) {
            return false;
        }
        if (i == 4) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

    public static int reverseInt(int i) {
        int j = 0;
        while (i > 0) {
            j = (j * 10) + (i % 10);
            i = i / 10;
        }
        return j;
    }

    public static Long reverselong(Long i) {
        Long j = 0l;
        while (i > 0) {
            j = (j * 10) + (i % 10);
            i = i / 10;
        }
        return j;
    }

    public static int HCF(int a, int b) {
        int hcf = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            while ((a % i == 0) && (b % i == 0)) {
                hcf *= i;
                a = a / i;
                b = b / i;
            }
        }
        return hcf;
    }

    public static int numberOfFactors(int i) {
        int factors = 0;
        boolean arr[] = MathHelper.primeSieve(i + 2);
        int j = 1;
        while (i > 1) {
            j++;
            while (!arr[j]) {
                j++;
            }
            if (i % j == 0) {
                factors++;
            }
            while (i % j == 0) {
                i = i / j;
            }
        }
        return factors;
    }

    public static boolean isPermutation(int i, int j) {
        char[] str1 = (i + "").toCharArray();
        char[] str2 = (j + "").toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);


        if ((new String(str1)).equals(new String(str2))) {
            return true;
        }

        return false;
    }

    public static int[] factorialArray(int i) {
        int[] arr = new int[i + 1];
        arr[0] = 1;
        for (int j = 1; j <= i; j++) {
            arr[j] = arr[j - 1] * j;
        }
        return arr;
    }

    public static int sumOfDigits(int i) {
        int sum = 0;
        while (i > 0) {
            sum += (i % 10);
            i = i / 10;
        }
        return sum;
    }

    public static int sumOfDigits(BigInteger i) {
        int sum = 0;
        while (!i.equals(new BigInteger("0"))) {
            sum += i.mod(new BigInteger("10")).intValue();
            i = i.divide(new BigInteger("10"));
        }
        return sum;
    }

    public static long nCr(long n, long r) {

        long ncr = 1;
        long nminusr = (n - r);

        long tempr = 2;
        long tempnminusr = 2;


        for (int i = 1; i <= n; i++) {
            ncr = ncr * i;

            while (ncr % tempr == 0 && tempr <= r) {
                ncr = ncr / tempr;
                tempr++;
            }


            while (ncr % tempnminusr == 0 && tempnminusr <= nminusr) {
                ncr = ncr / tempnminusr;
                tempnminusr++;
            }

        }
        return ncr;
    }

    public static String sortedDigits(Long num) {

        StringBuilder str = new StringBuilder();

        char arr[] = (num + "").toCharArray();
        for (int i = 0; i < 10; i++) {
            for (char a : arr) {
                if (a == i + '0') {
                    str.append(i);
                }
            }
        }
        return str.toString();
    }
}
