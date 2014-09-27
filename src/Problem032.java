import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreedish.ps on 26/09/14.
 */
public class Problem032 {
    public static void main(String[] args) {
        int sum =0;

        for(int product = 1; product<987654321;product++){
            //if product repeating continue
            if(repeatCheck(product)){
                continue;
            }


            //if unique numbers, factorise and check concatenation of multiplicand,
            // product and multiplier is pandigital

            for(int i=1;i<Math.sqrt(product);i++)
            {
                if(product % i == 0){
                    if((""+product+i+(product/i)).length() != 9){
                        continue;
                    }
                    else if(repeatCheck(new Integer((""+product+i+(product/i))))){
                        continue;
                    }
                    else if((""+product+i+(product/i)).contains("0")){
                        continue;
                    }
                    else{
                        System.out.println(product+"  "+i+"   "+(product/i));
                       sum+=product;
                        System.out.println(sum);
                        break;
                    }
                }

            }
        }


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
