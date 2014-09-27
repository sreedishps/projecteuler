import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreedish.ps on 27/09/14.
 */
public class Problem038 {
    static int counter =0;
    public static void main(String[] args) {
        for(int i = 987654321; i > 100000000; i--){
            if((i+"").contains("0")){
                continue;
            }
            else if(repeatCheck(i)){
                continue;
            }

            int num1 = (i/100000);
            int num2 = (i%100000);
           // System.out.println(i + " " + num1 + " " + num2);

            if(num1*2 == num2) {
                System.out.println(i + " " + num1 + " " + num2);
                counter++;
                break;
            }

        }
        System.out.println(counter);
    }
    private static boolean repeatCheck(int num) {
        List<Integer> digits = new ArrayList<Integer>();
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
