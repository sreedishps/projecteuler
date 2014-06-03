/**
 * Created by sreedish.ps on 04/06/14.
 * Even Fibonacci numbers
 */
public class problem002 {
    public static void main(String[] args) {
        int i=1,j=2,temp =0,sum =0;

        /*
        method 1
         */
        while(j < 4000000) {
            if(j % 2 == 0){
                sum+=j;
            }
            temp = i + j;
            i = j;
            j = temp;
        }
        System.out.println(sum);

        /*
        method 2 without the check for fibonacci number is even or not
        this exploits the fact that in the series
        1 1 (2) 3 5 (8) 13 21 (34) .... every third number is even
         */

        i=1;
        j=1;
        temp =0;
        sum =0;

        while(j < 4000000) {

            temp = i + j;
            sum+=temp;
            i = j;
            j = temp;

            temp = i + j;
            i = j;
            j= temp ;

            temp = i + j;
            i = j;
            j= temp ;
        }
        System.out.println(sum);
    }
}
