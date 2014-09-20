/**
 * Created by sreedish.ps on 20/09/14.
 */
public class Problem112 {
    public static void main(String[] args) {
        Long counter = 0L;
        Long proportion = 0L;

        for( Long num = 1L;num < 100000000;num++){
            if(check(num)){
                counter++;
            }
            proportion = (counter * 100/ num) ;
            if(proportion == 99) {
                System.out.println(num);
                break;
            }
        }

    }

    private static boolean check(Long num) {
        boolean inc = false,dec = false;
        while (num > 0) {
            Long dig1 = num % 10;
            num = num / 10;

            if(dig1 == (num % 10)){
                continue;
            }
            else if(dig1 > (num % 10)){
                if(num == 0){
                    return false;
                } else{
                    if(dec == true){
                        return true;
                    }
                    inc = true;

                }

            }
            else if(dig1 < (num % 10)){
                if(inc == true){
                    return true;
                }
                dec = true;
            }

        }

        return false;
    }
}
