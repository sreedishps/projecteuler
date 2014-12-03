/**
 * Created by sreedish.ps on 28/09/14.
 */
public class Problem058 {
    public static void main(String[] args) {
        int num = 1;
        int counter = 1;
        int primecounter = 0;
        boolean arr[] = MathHelper.primeSieve(109000000);
        int offset = 2;
        while (true) {
            for (int i = 1; i <= 4; i++) {
                if (num + (i * offset) < 109000000) {
                    if (arr[((num + (i * offset)))]) {
                        primecounter++;
                    }
                    counter++;
                } else {
                  //  System.out.println(num + (i * offset));
                    if (MathHelper.checkPrime((long)(num + (i * offset)))) {

                        primecounter++;
                    }
                    counter++;
                }
            }
            num = num + (4 * offset);


      //      System.out.println((offset + 1) + "  " +primecounter+"  "+counter+"  "+ (((double)primecounter * 100.0) / (double)counter));

            if (((double)primecounter ) / (double)counter < 0.1) {
              //  System.out.println(primecounter+"  "+counter);
                System.out.println(offset + 1);
                break;
            }
            offset += 2;

        }
    }
}
