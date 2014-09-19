/**
 * Created by sreedish.ps on 20/09/14.
 */
public class Problem027 {
    private static void efficient() {
        int llimit = -1000,ulimit = 1001;

        int maxA = llimit, maxB = llimit, max = 0;

        for(int a = llimit; a< ulimit;a++){
            for(int b = 3; b < ulimit;b+=2){ // b cannot be negative, cannot be composite

                int count = enumerate(a,b);
                if(count > max){
                    max = count;
                    maxA = a;
                    maxB = b;
                }
            }
        }
        System.out.println(maxA + "  "+maxB + "  "+max);
    }
    public static void bruteForce(){
        int llimit = -1000,ulimit = 1001;

        int maxA = llimit, maxB = llimit, max = 0;

        for(int a = llimit; a< ulimit;a++){
            for(int b = llimit; b < ulimit;b++){
                int count = enumerate(a,b);
                if(count > max){
                    max = count;
                    maxA = a;
                    maxB = b;
                }
            }
        }
        System.out.println(maxA + "  "+maxB + "  "+max);
    }

    private static int enumerate(int a, int b) {
        int counter =0;
        while(true){
            int value = counter*counter + a * counter + b;
            if(MathHelper.checkPrime(value)){
                counter++;
            }
            else{
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        bruteForce();
        System.out.println("Time taken (in ms)= "+
                (System.nanoTime() - startTime) / 1E6);

        startTime = System.nanoTime();
        efficient();
        System.out.println("Time taken (in ms)= "+
                (System.nanoTime() - startTime) / 1E6);


    }


}

