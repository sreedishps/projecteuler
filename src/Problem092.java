/**
 * Created by sreedish.ps on 20/09/14.
 */
public class Problem092 {
    public static void main(String[] args) {
        Long counter = 0L;

        for(Long num = 1L;num< 10000000L; num++){
            int val = check(num);
            if(val == 89){
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static int check(Long num) {
        int sum = 0;
        while(sum != 1 && sum != 89){
            sum =0;
            while(num != 0){
                sum += (num%10) * (num%10);
                num = num/10;
            }

            num = new Long(sum) ;
        }
        return sum;
    }
}
