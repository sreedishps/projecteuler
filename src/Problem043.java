import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreedish.ps on 27/09/14.
 */
public class Problem043 {
    public static void main(String[] args) {
        int counter =0;
        long sum =0;
        for(long i = 1111111111L; i < 9999999999L; i++) {
            if((i%1000)%17 != 0){
                continue;
            }
            if(((i%10000)/10)%13 != 0){
                continue;
            }
            if(((i%100000)/100)%11 != 0){
                continue;
            }
            if(((i%1000000)/1000)%7 != 0){
                continue;
            }
            if(((i%10000000)/10000)%5 != 0){
                continue;
            }
            if(((i%100000000)/100000)%3 != 0){
                continue;
            }
            if(((i%1000000000)/1000000)%2 != 0){
                continue;
            }
            if (repeatCheck(i)) {
                continue;
            }
            else{
                sum+=i;
                counter++;
            }
        }
        System.out.println(counter+"  "+sum);
    }
    private static boolean repeatCheck(long num) {
        List<Long> digits = new ArrayList<Long>();
        while(num > 0){
            if(digits.contains(num % 10)){
                return true;
            }
            digits.add(num%10);
            num = num /10;
        }
        return false;
    }
}
